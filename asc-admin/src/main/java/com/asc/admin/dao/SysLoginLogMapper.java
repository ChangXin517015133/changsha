package com.asc.admin.dao;

import java.util.List;

import com.asc.admin.entity.SysLog;
import com.asc.admin.entity.SysLoginLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Component
public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
    
    List<SysLog> findPage();
    
    List<SysLog> findPageByUserName(@Param(value = "userName") String userName);
    
    List<SysLog> findPageByStatus(@Param(value = "status") String status);
}