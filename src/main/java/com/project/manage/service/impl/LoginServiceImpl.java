package com.project.manage.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.project.manage.entity.PermissionEntity;
import com.project.manage.entity.RoleEntity;
import com.project.manage.entity.UserEntity;
import com.project.manage.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{

	@Override
	public UserEntity login() {
		return getMapByName();
	}

	private UserEntity getMapByName() {
		//共添加两个用户，两个用户都是admin一个角色，
        //wsl有query和add权限，zhangsan只有一个query权限
        PermissionEntity permissions1 = new PermissionEntity(1,"query");
        PermissionEntity permissions2 = new PermissionEntity(2,"add");
        Set<PermissionEntity> permissionsSet = new HashSet<>();
        permissionsSet.add(permissions1);
        permissionsSet.add(permissions2);
        RoleEntity role = new RoleEntity(1,"admin",permissionsSet);
        Set<RoleEntity> roleSet = new HashSet<>();
        roleSet.add(role);
        UserEntity user = new UserEntity(1,"wsl","123456",roleSet);
        Map<String ,UserEntity> map = new HashMap<>();
        map.put(user.getUserName(), user);

        PermissionEntity permissions3 = new PermissionEntity(3,"query");
        Set<PermissionEntity> permissionsSet1 = new HashSet<>();
        permissionsSet1.add(permissions3);
        RoleEntity role1 = new RoleEntity(2,"user",permissionsSet1);
        Set<RoleEntity> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        UserEntity user1 = new UserEntity(2,"zhangsan","123456",roleSet1);
        map.put(user1.getUserName(), user1);
        return map.get("admin");
	}
}
