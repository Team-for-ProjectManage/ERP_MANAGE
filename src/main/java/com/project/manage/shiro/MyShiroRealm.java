package com.project.manage.shiro;

import com.project.manage.entity.TSysUser;
import com.project.manage.service.IPermissionService;
import com.project.manage.service.IRoleService;
import com.project.manage.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class MyShiroRealm extends AuthorizingRealm{

	@Autowired
    private IUserService userService;
    
	@Autowired
    private IRoleService roleService;
    
    @Autowired
    private IPermissionService permissionService;
	
	private static Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

	/**
	 * 认证信息.(身份验证) : Authentication 是用来验证用户身份
     *
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        logger.info("---------------- 执行 Shiro 凭证认证 ----------------------");
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String userName = token.getUsername();
        String password = String.valueOf(token.getPassword());
//        TSysUser user = new TSysUser();
//        user.setUserName(name);
//        user.setUserPwd(password);
        // 从数据库获取对应用户名密码的用户
        TSysUser userList = userService.getUserByNameAndPassword(userName,password);
        if (userList != null) {
            // 用户为禁用状态
            if (Integer.parseInt(userList.getState()) != 1) {
                throw new DisabledAccountException();
            }
            logger.info("---------------- Shiro 凭证认证成功 ----------------------");
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    userList, //用户
                    userList.getUserPwd(), //密码
                    getName()  //realm name
            );
            return authenticationInfo;
        }
        throw new UnknownAccountException();
    }

    /**
             * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("---------------- 执行 Shiro 权限获取 ---------------------");
        Object principal = principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        if (principal instanceof TSysUser) {
        	TSysUser userLogin = (TSysUser) principal;
        	//根据用户id查询用户的角色信息
            Set<String> roles = roleService.findRoleNameByUserId(userLogin.getUserId());
            authorizationInfo.addRoles(roles);

            //根据用户的信息查询用户的权限
            Set<String> permissions = permissionService.findPermissionsByUserId(userLogin.getUserId());
            authorizationInfo.addStringPermissions(permissions);
        }
        logger.info("---- 获取到以下权限 ----");
        logger.info(authorizationInfo.getStringPermissions().toString());
        logger.info("---------------- Shiro 权限获取成功 ----------------------");
        return authorizationInfo;
    }
}
