package com.asc.admin.service.impl;

import com.asc.admin.dao.SysUserMapper;
import com.asc.admin.entity.SysUser;
import com.asc.admin.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
}
