package com.asc.admin.controller;

import com.asc.admin.service.SysUserService;
import com.asc.asccommon.utils.HttpResult;
import com.asc.asccore.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("/findAll")
    public Object findAll(){
        return HttpResult.ok("");
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest){
        return HttpResult.ok("");
    }

}
