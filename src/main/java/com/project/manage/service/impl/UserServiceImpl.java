package com.project.manage.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.manage.common.Result;
import com.project.manage.common.ResultCode;
import com.project.manage.dao.TSysUserMapper;
import com.project.manage.entity.TSysUser;
import com.project.manage.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private TSysUserMapper userDao;

	@Override
	public Result save(TSysUser user) {
		logger.info("UserServiceImpl >> save start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int inserted = userDao.insertSelective(user);
			result.setData(inserted);
			logger.info("UserServiceImpl >> save end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("UserServiceImpl >> save error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result updateById(TSysUser user) {
		logger.info("UserServiceImpl >> updateById start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int updated = userDao.updateByPrimaryKeySelective(user);
			result.setData(updated);
			logger.info("UserServiceImpl >> updateById end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("UserServiceImpl >> updateById error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result delete(Integer userId) {
		logger.info("UserServiceImpl >> delete start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int deleted = userDao.deleteByPrimaryKey(userId);
			result.setData(deleted);
			logger.info("UserServiceImpl >> delete end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("UserServiceImpl >> delete error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result getById(Integer userId) {
		logger.info("UserServiceImpl >> getById start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			TSysUser user = userDao.selectByPrimaryKey(userId);
			result.setData(user);
			logger.info("UserServiceImpl >> getById end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("UserServiceImpl >> getById error : " + e.getMessage());
		}		
		return result;
	}


	@Override
	public Result findAll() {
		logger.info("UserServiceImpl >> findAll start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			List<TSysUser> users = userDao.findAll();
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
