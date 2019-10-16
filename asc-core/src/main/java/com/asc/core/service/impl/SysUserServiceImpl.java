package com.asc.core.service.impl;

import com.asc.core.dao.SysUserMapper;
import com.asc.core.entity.SysUser;
import com.asc.core.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
}
