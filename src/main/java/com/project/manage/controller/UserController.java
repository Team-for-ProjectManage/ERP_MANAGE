package com.project.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.manage.common.Result;
import com.project.manage.service.IUserService;
import com.project.manage.service.impl.UserServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/")
@Api(description = "用户操作接口")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	@ApiOperation(value = "获取用户信息", notes="获取用户信息")
	public Result findAll() {
		return userService.findAll();
	}
	

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	@ApiOperation(value = "获取用户信息", notes="获取用户信息")
	public String indexShow() {
		return "index1";
	}
	
}
