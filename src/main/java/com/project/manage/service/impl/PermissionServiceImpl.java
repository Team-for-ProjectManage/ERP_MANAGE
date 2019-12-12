package com.project.manage.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.manage.common.Result;
import com.project.manage.common.ResultCode;
import com.project.manage.dao.TSysPermissionMapper;
import com.project.manage.entity.TSysPermission;
import com.project.manage.service.IPermissionService;

@Service
public class PermissionServiceImpl implements IPermissionService{

	private static final Logger logger = LoggerFactory.getLogger(PermissionServiceImpl.class);
	
	@Autowired
	private TSysPermissionMapper permissionDao;
	
	@Override
	public Result save(TSysPermission permission) {
		logger.info("PermissionServiceImpl >> save start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int inserted = permissionDao.insertSelective(permission);
			result.setData(inserted);
			logger.info("PermissionServiceImpl >> save end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("PermissionServiceImpl >> save error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result updateById(TSysPermission permission) {
		logger.info("PermissionServiceImpl >> updateById start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int updated = permissionDao.updateByPrimaryKeySelective(permission);
			result.setData(updated);
			logger.info("PermissionServiceImpl >> updateById end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("PermissionServiceImpl >> updateById error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result delete(Integer permissionId) {
		logger.info("PermissionServiceImpl >> delete start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			int deleted = permissionDao.deleteByPrimaryKey(permissionId);
			result.setData(deleted);
			logger.info("PermissionServiceImpl >> delete end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("PermissionServiceImpl >> delete error : " + e.getMessage());
		}		
		return result;
	}

	@Override
	public Result getById(Integer permissionId) {
		logger.info("PermissionServiceImpl >> getById start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			TSysPermission permissions = permissionDao.selectByPrimaryKey(permissionId);
			result.setData(permissions);
			logger.info("PermissionServiceImpl >> getById end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("PermissionServiceImpl >> getById error : " + e.getMessage());
		}		
		return result;
	}
	
	@Override
	public Result findAll() {
		logger.info("PermissionServiceImpl >> findAll start");
		Result result = new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg());
		try {
			List<TSysPermission> permissions = permissionDao.findAll();
			result.setData(permissions);
			logger.info("PermissionServiceImpl >> findAll end");
		} catch (Exception e) {
			result.setCode(ResultCode.FAIL.getCode());
			result.setMsg(ResultCode.FAIL.getMsg());
			result.setData(e.getMessage());
			logger.error("PermissionServiceImpl >> findAll error : " + e.getMessage());
		}		
		return result;
	}

}
