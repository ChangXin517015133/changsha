package com.asc.admin.service.impl;

import java.util.List;

import com.asc.admin.dao.SysLogMapper;
import com.asc.admin.entity.SysLog;
import com.asc.admin.service.SysLogService;
import com.asc.asccore.page.MybatisPageHelper;
import com.asc.asccore.page.PageRequest;
import com.asc.asccore.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SysLogServiceImpl  implements SysLogService {

	@Autowired
	private SysLogMapper sysLogMapper;

	@Override
	public int save(SysLog record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysLogMapper.insertSelective(record);
		}
		return sysLogMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(SysLog record) {
		return sysLogMapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<SysLog> records) {
		for(SysLog record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysLog findById(Long id) {
		return sysLogMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		Object label = pageRequest.getParam("userName");
		if(label != null) {
			return MybatisPageHelper.findPage(pageRequest, sysLogMapper, "findPageByUserName", label);
		}
		return MybatisPageHelper.findPage(pageRequest, sysLogMapper);
	}
	
}
