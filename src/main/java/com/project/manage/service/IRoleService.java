package com.project.manage.service;

import com.project.manage.common.Result;
import com.project.manage.entity.TSysRole;

public interface IRoleService {

	public Result save(TSysRole role);
	
	public Result updateById(TSysRole role);
	
	public Result delete(Integer roleId);
	
	public Result getById(Integer roleId);
	
	public Result findAll();

}
