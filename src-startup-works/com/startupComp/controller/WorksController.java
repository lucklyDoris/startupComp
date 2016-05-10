package com.startupComp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.startupComp.service.WorksService;
import com.startupComp.service.impl.WorksServiceImpl;

@Controller
public class WorksController {
	
	@Autowired
	private WorksService worksService;
	
	@Autowired
	private WorksServiceImpl worksServiceImpl;
	
	
}
