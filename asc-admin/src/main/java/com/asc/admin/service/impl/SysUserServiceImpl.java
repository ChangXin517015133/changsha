package com.asc.admin.service.impl;

import com.asc.admin.dao.SysUserMapper;
import com.asc.admin.entity.SysUser;
import com.asc.admin.service.ISysUserService;
import com.asc.common.PageRequest;
import com.asc.common.PageResult;
import com.asc.core.common.MybatisPageHelper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public File createUserExcelFile(PageRequest pageRequest) {
        return null;
    }

    @Override
    public PageResult findAll(PageRequest pageRequest) {

        return MybatisPageHelper.findPage(pageRequest,sysUserMapper);
    }
}
