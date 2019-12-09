package com.project.manage.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.manage.dao.UserDao;
import com.project.manage.entity.UserEntity;
import com.project.manage.model.UserVo;
import com.project.manage.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{

	private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	private UserDao userDao;

	@Override
	public UserEntity getUserByName(String userName) {
		UserEntity userEntity = null;
		try {
			userEntity = userDao.getUserByName(userName);
			logger.info("LoginServiceImpl >> getUserByName : " + userEntity);
		} catch (Exception e) {
			logger.error("LoginServiceImpl >> getUserByName feild: " + e.getMessage());
		}
		return userEntity;
	}
}
