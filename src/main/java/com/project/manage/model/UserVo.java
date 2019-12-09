package com.project.manage.model;

import java.sql.Date;
import java.util.Set;

/**
 * 用户表
 * @author Administrator
 *
 */
public class UserVo {

	private Integer userId;
	
    private String userName;
    
    private String userCode;
    
    private String userPwd;
    
    private Date userBirthday;

    /**
            * 用户对应的角色集合
     */
    private Set<RoleVo> roles;

    public UserVo(Integer userId,String userName,String userPwd,Set<RoleVo> roles){
    	this.userId = userId;
    	this.userName = userName;
    	this.userPwd = userPwd;
    	this.roles = roles;
    	
    }
    
    public UserVo(Integer userId,String userName,String userCode,String userPwd,Date userBirthday,Set<RoleVo> roles){
    	this.userId = userId;
    	this.userName = userName;
    	this.userCode = userCode;
    	this.userPwd = userPwd;
    	this.userBirthday = userBirthday;
    	this.roles = roles;
    }
    
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userCode=" + userCode + ", userPwd="
				+ userPwd + ", userBirthday=" + userBirthday + "]";
	}

	public Set<RoleVo> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleVo> roles) {
		this.roles = roles;
	}

	
}
