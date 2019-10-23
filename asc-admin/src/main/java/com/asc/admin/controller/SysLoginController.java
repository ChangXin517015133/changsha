package com.asc.admin.controller;

import com.asc.admin.entity.SysUser;
import com.asc.admin.security.JwtAuthenticatioToken;

import com.asc.admin.service.SysUserService;
import com.asc.admin.utils.PasswordUtils;
import com.asc.admin.utils.SecurityUtils;
import com.asc.admin.vo.LoginBean;
import com.asc.asccommon.utils.HttpResult;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.commons.compress.utils.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 登录控制器
 * @author changxin
 * @date 2019-10-18
 */
@RestController
public class SysLoginController {
    @Autowired
    private Producer producer;
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/kaptcha.jpg")
    public void kaptcha(HttpServletResponse response, HttpServletRequest request)throws ServletException, IOException {
        response.setHeader("Cache-Control","no-store,no-cache");
        response.setContentType("image/jpeg");
        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存验证码到session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY,text);
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image,"jpg",outputStream);
        IOUtils.closeQuietly(outputStream);

    }

    @PostMapping("/login")
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request)throws IOException{
        String username = loginBean.getAccount();
        String password = loginBean.getPassword();
        String captcha = loginBean.getCaptcha();
        // 从session中获取之前保存的验证码跟前台传来的验证码进行匹配
        Object kaptcha = request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if(kaptcha == null){
            return HttpResult.error("验证码已失效");
        }
        if(!captcha.equals(kaptcha)){
            return HttpResult.error("验证码不正确");
        }
        // 用户信息
        SysUser user = sysUserService.findByName(username);
        // 账号不存在、密码错误
        if (user == null) {
            return HttpResult.error("账号不存在");
        }
        if (!PasswordUtils.matches(user.getSalt(), password, user.getPassword())) {
            return HttpResult.error("密码不正确");
        }
        // 账号锁定
        if (user.getStatus() == 0) {
            return HttpResult.error("账号已被锁定,请联系管理员");
        }
        // 系统登录认证
        JwtAuthenticatioToken token = SecurityUtils.login(request, username, password, authenticationManager);
        return HttpResult.ok(token);

    }


}
