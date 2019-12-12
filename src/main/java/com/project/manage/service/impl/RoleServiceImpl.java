package com.project.manage.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.manage.common.Result;
import com.project.manage.common.ResultCode;
import com.project.manage.dao.TSysRoleMapper;
import com.project.manage.dao.TSysUserMapper;
import com.project.manage.entity.TSysRole;
import com.project.manage.entity.TSysUser;
import com.project.manage.service.IRoleService;
import com.project.manage.service.IUserService;

import lombok.extern.slf4j.Slf4j;

@Service
public class RoleServiceImpl implements IRoleService{

	private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);
	
	@Autowired
	private TSysRoleMapper roleDao;

	@Override
	public Result save(TSysRole role) {
		logger.info("RoleServiceImpl >> save start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int inserted = roleDao.insertSelective(role);
			result.setData(inserted);
			logger.info("RoleServiceImpl >> save end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("RoleServiceImpl >> save error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result updateById(TSysRole role) {
		logger.info("RoleServiceImpl >> updateById start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int updated = roleDao.updateByPrimaryKeySelective(role);
			result.setData(updated);
			logger.info("RoleServiceImpl >> updateById end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("RoleServiceImpl >> updateById error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result delete(Integer roleId) {
		logger.info("RoleServiceImpl >> delete start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int deleted = roleDao.deleteByPrimaryKey(roleId);
			result.setData(deleted);
			logger.info("RoleServiceImpl >> delete end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("RoleServiceImpl >> delete error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result getById(Integer roleId) {
		logger.info("RoleServiceImpl >> getById start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			TSysRole role = roleDao.selectByPrimaryKey(roleId);
			result.setData(role);
			logger.info("RoleServiceImpl >> getById end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("RoleServiceImpl >> getById error : " + e.getMessage());
		}		
		return result;
	}
	
	@Override
	public Result findAll() {
		logger.info("RoleServiceImpl >> findAll start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			List<TSysRole> roles = roleDao.findAll();
			result.setData(roles);
			logger.info("RoleServiceImpl >> findAll end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("RoleServiceImpl >> findAll error : " + e.getMessage());
		}		
		return result;
	}

}
