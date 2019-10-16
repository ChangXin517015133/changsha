package com.asc.admin.controller;

import com.asc.admin.service.ISysUserService;
import com.asc.common.HttpResult;
import com.asc.common.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;
    @RequestMapping("/findAll")
    public Object findAll(){
        return HttpResult.ok(sysUserService.list());
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest){
        return HttpResult.ok(sysUserService.findAll(pageRequest));
    }

}
