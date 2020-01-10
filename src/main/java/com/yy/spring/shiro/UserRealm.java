package com.yy.spring.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.yy.spring.entity.User;
import com.yy.spring.service.UserService;

public class UserRealm extends AuthorizingRealm{
	//业务注入
	@Autowired
	private UserService userService;
/**
 * 执行授权逻辑
 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		System.out.println("执行授权逻辑");
		return null;
	}
/**
 * 执行认证逻辑
 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println("执行认证逻辑");
		//编写shiro认证逻辑，判断用户名和密码
		//判断用户名
		UsernamePasswordToken token=(UsernamePasswordToken)arg0;
		User user = userService.findUserByUserName(token.getUsername());
	
		if(user==null) {
			return null;//shiro底层将抛出UnKnownAccountException异常
		}
		//判断密码
		//第一个参数是subject.login(token)的数据    第二个参数是数据库密码    第三个参数是shiro的名字
		return new SimpleAuthenticationInfo("",user.getUserpassword(),"");
	}

}
