package com.project.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.manage.entity.UserEntity;

@Mapper
public interface UserDao {

	public List<UserEntity> findAll(); 

}
