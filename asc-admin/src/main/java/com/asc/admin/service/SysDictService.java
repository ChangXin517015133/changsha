package com.asc.admin.service;

import java.util.List;

import com.asc.admin.entity.SysDict;
import com.asc.asccore.service.CurdService;


/**
 * 字典管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
