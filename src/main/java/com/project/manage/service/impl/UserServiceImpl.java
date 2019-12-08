package com.project.manage.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.manage.common.Result;
import com.project.manage.common.ResultCode;
import com.project.manage.dao.UserDao;
import com.project.manage.entity.UserEntity;
import com.project.manage.service.IUserService;

import lombok.extern.slf4j.Slf4j;

@Service
public class UserServiceImpl implements IUserService{

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public Result findAll() {
		logger.info("UserServiceImpl >> findAll start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			List<UserEntity> users = userDao.findAll();
			result.setData(users);
			logger.info("UserServiceImpl >> findAll end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("UserServiceImpl >> findAll error : " + e.getMessage());
		}		
		return result;
	}

}
