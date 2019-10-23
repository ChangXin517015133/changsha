package com.asc.admin.dao;

import java.util.List;

import com.asc.admin.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


@Component
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    List<SysUser> findPage();

    @Select("select * from sys_user where name=#{name}")
    SysUser findByName(@Param(value = "name") String name);
    
	List<SysUser> findPageByName(@Param(value = "name") String name);
	
	List<SysUser> findPageByNameAndEmail(@Param(value = "name") String name, @Param(value = "email") String email);
}