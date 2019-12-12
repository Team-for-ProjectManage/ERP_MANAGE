package com.project.manage.model;

/**
 * 权限表
 * @author Administrator
 *
 */
public class PermissionVo {

	private Integer id;
	
    private String permissionName;

    public PermissionVo(Integer id,String permissionName){
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
