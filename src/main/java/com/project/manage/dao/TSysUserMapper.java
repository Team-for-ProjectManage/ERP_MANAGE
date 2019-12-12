package com.project.manage.dao;

import java.util.List;

import com.project.manage.entity.TSysUser;

public interface TSysUserMapper {
	
    int deleteByPrimaryKey(Integer userId);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    TSysUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);
    
    List<TSysUser> findAll();
}