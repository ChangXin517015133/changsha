package com.asc.admin.dao;

import com.asc.admin.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserMapper extends BaseMapper<SysUser> {

    @Select("select * from sys_user")
    List<SysUser> findPage();
}
