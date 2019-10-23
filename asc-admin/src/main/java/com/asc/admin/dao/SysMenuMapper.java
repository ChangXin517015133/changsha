package com.asc.admin.dao;

import java.util.List;

import com.asc.admin.entity.SysMenu;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface SysMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
    
	List<SysMenu> findPage();

	List<SysMenu> findPageByName(@Param(value = "name") String name);
	@Select("select * from sys_menu")
	List<SysMenu> findAll();

	List<SysMenu> findByUserName(@Param(value = "userName") String userName);

	List<SysMenu> findRoleMenus(@Param(value = "roleId") Long roleId);
}