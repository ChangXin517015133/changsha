package com.asc.huanghua.service.impl;

import com.asc.huanghua.dao.SysUserMapper;
import com.asc.huanghua.entity.SysUser;
import com.asc.huanghua.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
}
