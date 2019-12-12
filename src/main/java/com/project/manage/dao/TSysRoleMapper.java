package com.project.manage.dao;

import java.util.List;

import com.project.manage.entity.TSysRole;

public interface TSysRoleMapper {
	
    int deleteByPrimaryKey(Integer roleId);

    int insert(TSysRole record);

    int insertSelective(TSysRole record);

    TSysRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(TSysRole record);

    int updateByPrimaryKey(TSysRole record);
    
    List<TSysRole> findAll();
}