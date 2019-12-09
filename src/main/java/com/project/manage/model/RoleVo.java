package com.project.manage.model;

import java.util.Set;

/**
  *    角色
 * @author Administrator
 *
 */
public class RoleVo {

	private Integer id;
	
    private String roleName;

    /**
            * 角色对应权限集合
     */
    private Set<PermissionVo> permission;
    
    public RoleVo(Integer id,String roleName,Set<PermissionVo> permission){
    	this.id = id;
		this.roleName = roleName;
		this.permission = permission;
    }
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<PermissionVo> getPermission() {
		return permission;
	}

	public void setPermission(Set<PermissionVo> permission) {
		this.permission = permission;
	}
	
	
}
