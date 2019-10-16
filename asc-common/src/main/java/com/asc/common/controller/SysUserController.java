package com.asc.common.controller;

import com.asc.common.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;
    @RequestMapping("/findAll")
    public Object findAll(){
        return sysUserService.list();
    }
}