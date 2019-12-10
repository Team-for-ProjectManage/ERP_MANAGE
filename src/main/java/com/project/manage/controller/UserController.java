package com.project.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.manage.common.Result;
import com.project.manage.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/v1")
@Api(description = "用户操作接口")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	@ApiOperation(value = "获取用户信息", notes="获取用户信息")
	@ResponseBody
	public Result findAll() {
		logger.debug("this is info");
		logger.info("this is info");
		logger.error("this is error");
		logger.warn("this is info");
		System.out.println("sdasdffsd");
		return userService.findAll();
	}
	

	/*
	 * @RequestMapping(value = "/index",method = RequestMethod.GET)
	 * 
	 * @ApiOperation(value = "主页面", notes="主页面") public String indexShow() { return
	 * "index"; }
	 */
	
}
