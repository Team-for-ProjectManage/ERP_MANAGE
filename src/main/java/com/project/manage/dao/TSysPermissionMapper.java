package com.project.manage.dao;

import java.util.List;

import com.project.manage.entity.TSysPermission;

public interface TSysPermissionMapper {
	
    int deleteByPrimaryKey(Integer permissionId);

    int insert(TSysPermission record);

    int insertSelective(TSysPermission record);

    TSysPermission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(TSysPermission record);

    int updateByPrimaryKey(TSysPermission record);

	List<TSysPermission> findAll();
}