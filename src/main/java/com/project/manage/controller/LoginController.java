package com.project.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.manage.common.Result;
import com.project.manage.entity.UserEntity;
import com.project.manage.service.ILoginService;
import com.project.manage.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/v1")
@Api(description = "用户登录")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	@ApiOperation(value = "获取用户信息", notes="获取用户信息")
	public String findAll() {
		UserEntity user = loginService.login();
		return "index";
		
	}
	
}
