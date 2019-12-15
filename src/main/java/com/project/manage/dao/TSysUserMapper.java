package com.project.manage.dao;

import java.util.List;

import com.project.manage.entity.TSysUser;

import io.lettuce.core.dynamic.annotation.Param;

public interface TSysUserMapper {
	
    int deleteByPrimaryKey(Integer userId);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    TSysUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);
    
    List<TSysUser> findAll();


	/**
	 * 根据用户名和密码获取用户信息
	 * @param userName
	 * @param password
	 * @return
	 */
	public TSysUser getUserByNameAndPassword(@Param("userName")String userName, @Param("password")String password);
}