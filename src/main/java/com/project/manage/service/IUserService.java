package com.project.manage.service;

import java.util.Set;

import com.project.manage.common.Result;
import com.project.manage.entity.TSysUser;

import io.lettuce.core.dynamic.annotation.Param;

public interface IUserService {

	public Result save(TSysUser user);
	
	public Result updateById(TSysUser user);
	
	public Result delete(Integer userId);
	
	public Result getById(Integer userId);
	
	public Result findAll();

	/**
	 * 根据用户名和密码获取用户信息
	 * @param userName
	 * @param password
	 * @return
	 */
	public TSysUser getUserByNameAndPassword(String userName, String password);

}
