package com.project.manage.service;

import com.project.manage.common.Result;
import com.project.manage.entity.TSysPermission;

public interface IPermissionService {

	public Result save(TSysPermission permission);
	
	public Result updateById(TSysPermission permission);
	
	public Result delete(Integer permissionId);
	
	public Result getById(Integer permissionId);
	
	public Result findAll();

}
