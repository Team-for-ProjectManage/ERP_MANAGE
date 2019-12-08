package com.project.manage.entity;

import java.util.Set;

/**
  *    角色
 * @author Administrator
 *
 */
public class RoleEntity {

	private Integer id;
	
    private String roleName;

    /**
            * 角色对应权限集合
     */
    private Set<PermissionEntity> permission;
    
    public RoleEntity(Integer id,String roleName,Set<PermissionEntity> permission){
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

	public Set<PermissionEntity> getPermission() {
		return permission;
	}

	public void setPermission(Set<PermissionEntity> permission) {
		this.permission = permission;
	}
	
	
}
