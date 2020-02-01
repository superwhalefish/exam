package com.yy.spring.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.yy.spring.entity.User;
import com.yy.spring.service.UserService;

public class UserRealm extends AuthorizingRealm{
	//业务注入
	@Autowired
	private UserService userService;
/**
 * 执行授权逻辑 授权认证
 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		System.out.println("执行授权逻辑");
		//给资源进行授权
		 SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		
		 //查询当前用户权限
		 //获取当前登陆用户信息
		 Subject subject = SecurityUtils.getSubject();
		 User user = (User)subject.getPrincipal();
		 //添加资源的授权  	字符串需和shiro配置认证授权perms[]内的内容保持一直
		 //info.addStringPermission("user:exam");
		return info;
	}
/**
 * 执行认证逻辑 登陆认证
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
		return new SimpleAuthenticationInfo(user.getId(),user.getUserpassword(),"");
	}

}
