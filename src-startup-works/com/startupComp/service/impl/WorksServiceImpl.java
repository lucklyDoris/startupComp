package com.startupComp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.startupComp.mapper.IBaseMapper;
import base.startupComp.service.BaseService;

import com.startupComp.client.WorksMapper;
import com.startupComp.model.Works;
import com.startupComp.model.WorksExample;
import com.startupComp.service.WorksService;

@Service
public class WorksServiceImpl extends BaseService<Works,WorksExample,Integer> implements WorksService {
	private static final long serialVersionUID = 3869087316854073422L;
	
	@Autowired
	private WorksMapper worksMapper;
	
	@Override
	public IBaseMapper<Works, WorksExample, Integer> getMapper() {
		return worksMapper;
	}
}
