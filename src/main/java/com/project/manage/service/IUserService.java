package com.project.manage.service;

import com.project.manage.common.Result;
import com.project.manage.entity.TSysUser;

public interface IUserService {

	public Result save(TSysUser user);
	
	public Result updateById(TSysUser user);
	
	public Result delete(Integer userId);
	
	public Result getById(Integer userId);
	
	public Result findAll();

}
