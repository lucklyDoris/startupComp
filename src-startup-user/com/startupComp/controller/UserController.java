package com.startupComp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import base.startupComp.model.OptResult;
import base.startupComp.model.PageRequest;

import com.startupComp.model.UserStartupExample;
import com.startupComp.service.UserStartupService;

@Controller
public class UserController{
	
	@Autowired
	private UserStartupService userService;
	
	@ResponseBody
	@RequestMapping(value="/getFirst",method={RequestMethod.GET,RequestMethod.POST})
	public OptResult getFirst(@RequestParam(value="userId",required=false)String userId,PageRequest<UserStartupExample> pageRequest){
		UserStartupExample userStartupExample=new UserStartupExample();
		userStartupExample.createCriteria().andUserIdEqualTo(Integer.parseInt(userId));
		pageRequest.setCondition(userStartupExample);
		return userService.query(pageRequest);
	}
	
	@RequestMapping(value="/returnIndex",method={RequestMethod.GET,RequestMethod.POST})
	public String returnIndex(){
		return "/index";
	}
	
}
