package com.asc.admin.service;

import java.util.List;

import com.asc.admin.entity.SysDept;
import com.asc.asccore.service.CurdService;


/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @return
	 */
	List<SysDept> findTree();
}
