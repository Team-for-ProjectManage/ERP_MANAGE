package com.project.manage.entity;

/**
 * 权限表
 * @author Administrator
 *
 */
public class PermissionEntity {

	private Integer id;
	
    private String permissionName;

    public PermissionEntity(Integer id,String permissionName){
    	this.id = id;
    	this.permissionName = permissionName;
    };
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
    
}
