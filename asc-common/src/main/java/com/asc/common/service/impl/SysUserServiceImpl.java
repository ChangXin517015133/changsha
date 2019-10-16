package com.asc.common.service.impl;

import com.asc.common.dao.SysUserMapper;
import com.asc.common.entity.SysUser;
import com.asc.common.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
}
