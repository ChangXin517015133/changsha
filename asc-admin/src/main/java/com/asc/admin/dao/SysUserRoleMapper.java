package com.asc.admin.dao;

import java.util.List;

import com.asc.admin.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

	List<SysUserRole> findUserRoles(@Param(value = "userId") Long userId);

	int deleteByUserId(@Param(value = "userId") Long userId);
}