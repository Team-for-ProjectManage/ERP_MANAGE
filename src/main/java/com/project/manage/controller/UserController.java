package com.project.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.manage.common.Result;
import com.project.manage.entity.TSysUser;
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
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	@ApiOperation(value = "保存一个用户", notes="保存一个用户")
	@ResponseBody
	public Result save(@RequestBody TSysUser user) {
		return userService.save(user);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	@ApiOperation(value = "编辑一个用户", notes="编辑一个用户")
	@ResponseBody
	public Result update(@RequestBody TSysUser user) {
		return userService.updateById(user);
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	@ApiOperation(value = "删除一个用户", notes="删除一个用户")
	@ResponseBody
	public Result delete(@RequestParam("userId") Integer userId) {
		return userService.delete(userId);
	}
	
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	@ApiOperation(value = "获取一个用户信息", notes="获取一个用户信息")
	@ResponseBody
	public Result get(@RequestParam("userId") Integer userId) {
		return userService.getById(userId);
	}
	
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	@ApiOperation(value = "获取用户信息", notes="获取用户信息")
	@ResponseBody
	public Result findAll() {
		return userService.findAll();
	}
}
