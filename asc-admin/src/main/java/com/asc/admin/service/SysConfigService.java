package com.asc.admin.service;

import java.util.List;

import com.asc.admin.entity.SysConfig;
import com.asc.asccore.service.CurdService;


/**
 * 系统配置管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
