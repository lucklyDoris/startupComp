package com.startupComp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.startupComp.mapper.IBaseMapper;
import base.startupComp.service.BaseService;

import com.startupComp.client.UserStartupMapper;
import com.startupComp.model.UserStartup;
import com.startupComp.model.UserStartupExample;
import com.startupComp.service.UserStartupService;

@Service
public class UserServiceImpl extends BaseService<UserStartup,UserStartupExample,Integer> implements UserStartupService {
	private static final long serialVersionUID = -7217001145124338600L;

	@Autowired
	private UserStartupMapper userStartupMapper;
	
	@Override
	public IBaseMapper<UserStartup, UserStartupExample, Integer> getMapper() {
		return userStartupMapper;
	}
}
