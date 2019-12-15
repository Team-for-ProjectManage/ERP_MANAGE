package com.project.manage.dao;

import java.util.List;

import com.project.manage.entity.TSysPermission;

import io.lettuce.core.dynamic.annotation.Param;

public interface TSysPermissionMapper {
	
    int deleteByPrimaryKey(Integer permissionId);

    int insert(TSysPermission record);

    int insertSelective(TSysPermission record);

    TSysPermission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(TSysPermission record);

    int updateByPrimaryKey(TSysPermission record);

	List<TSysPermission> findAll();

	/**
	 * 根据用户id查询用户的权限
	 * @param userId
	 * @return
	 */
	List<TSysPermission> findPermissionsByUserId(@Param("userId") Integer userId);
}