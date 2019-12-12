package com.project.manage.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/v1")
@Api(description = "用户登录")
public class LoginController {
	
	/*
	 * @RequestMapping(value = "/login",method = RequestMethod.GET)
	 * 
	 * @ApiOperation(value = "用户登录", notes="用户登录") public String
	 * login(@RequestParam("userName") String userName,@RequestParam("userPwd")
	 * String userPwd) { //添加用户认证信息 Subject subject = SecurityUtils.getSubject();
	 * UsernamePasswordToken usernamePasswordToken = new
	 * UsernamePasswordToken(userName,userPwd); try { //进行验证，这里可以捕获异常，然后返回对应信息
	 * subject.login(usernamePasswordToken); //subject.checkRole("admin");
	 * //subject.checkPermissions("query", "add"); } catch (AuthenticationException
	 * e) { e.printStackTrace(); return "账号或密码错误！"; } catch (AuthorizationException
	 * e) { e.printStackTrace(); return "没有权限"; } return "login success";
	 * 
	 * }
	 */
	
    //注解验角色和权限
	/*
	 * @RequiresRoles("admin")
	 * 
	 * @RequiresPermissions("add")
	 * 
	 * @RequestMapping(value = "/index",method = RequestMethod.GET) public String
	 * index() { return "index!"; }
	 */
	
}
