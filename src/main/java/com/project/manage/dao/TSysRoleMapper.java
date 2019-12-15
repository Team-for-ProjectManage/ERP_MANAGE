package com.project.manage.dao;

import java.util.List;
import java.util.Set;

import com.project.manage.entity.TSysRole;

import io.lettuce.core.dynamic.annotation.Param;

public interface TSysRoleMapper {
	
    int deleteByPrimaryKey(Integer roleId);

    int insert(TSysRole record);

    int insertSelective(TSysRole record);

    TSysRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(TSysRole record);

    int updateByPrimaryKey(TSysRole record);
    
    List<TSysRole> findAll();

    /**
     	* 根据用户名查看角色信息
     * @param userId
     * @return
     */
    List<TSysRole> findRoleNameByUserId(@Param("userId") Integer userId);
}