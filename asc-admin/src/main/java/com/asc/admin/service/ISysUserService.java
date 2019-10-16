package com.asc.admin.service;

import com.asc.admin.entity.SysUser;
import com.asc.common.PageRequest;
import com.asc.common.PageResult;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.File;
import java.util.List;

public interface ISysUserService extends IService<SysUser> {

    public File createUserExcelFile(PageRequest pageRequest);
    PageResult findAll(PageRequest pageRequest);
}
