package com.project.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.manage.common.Result;
import com.oa.manage.common.ResultCode;
import com.project.manage.dao.UserDao;
import com.project.manage.entity.UserEntity;
import com.project.manage.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public Result findAll() {
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			List<UserEntity> users = userDao.findAll();
			result.setData(users);
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
		}		
		return result;
	}

}
