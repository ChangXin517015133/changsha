package com.asc.admin.dao;

import com.asc.admin.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserTest {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Test
    public void insert(){

        SysUser sysUser = new SysUser();
        sysUser.setMobile("15610016863");
        sysUser.setAvatar("/user/acatar/image1.jpg");
        sysUser.setDeptId(0L);
        sysUser.setName("管理员");
        sysUser.setNickName("管理员");
        sysUser.setSalt("md5");
        sysUser.setPassword("123456");
        sysUser.setStatus(0);
        int rows=sysUserMapper.insert(sysUser);
        System.out.println(rows);
    }

}
