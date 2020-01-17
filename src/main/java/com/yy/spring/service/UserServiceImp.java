package com.yy.spring.service;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.yy.spring.dao.UserDao;
import com.yy.spring.entity.User;
import com.yy.spring.util.ResultFinalString;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;
/**
 * 根据账户查询
 */
	@Override
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		User selectList = userDao.selectByUsername(username);
		return selectList;
	}
	/**
	 * 用户登陆
	 */
@Override
public Integer tologin(String username, String userpassword) {
	// TODO Auto-generated method stub
	/**
	 * shiro编写认证
	 */
	//获取subject
	Subject subject = SecurityUtils.getSubject();
	//封装用户数据
	UsernamePasswordToken token =new UsernamePasswordToken(username,userpassword);
	//执行登陆方法
	Integer LOGINMESSAGER=null;
	
	try {
		subject.login(token);
		if(ResultFinalString.USERTLOGIN_STUDENTFIRSTANDSCEND.equals(username.substring(0, 2))) {
			LOGINMESSAGER= ResultFinalString.USERTLOGINLOGIN_STUDENT;
		}
		if(ResultFinalString.USERTLOGIN_TECAHERFIRSTANDSCEND.equals(username.substring(0, 2))) {
			LOGINMESSAGER=ResultFinalString.USERTLOGINLOGINSUCCESS_TEACHER;
		}
	} catch (UnknownAccountException e) {
		//登陆失败:用户名不存在
		LOGINMESSAGER=ResultFinalString.USERTLOGIN_USER_ISNULL;  
		// TODO: handle exception
	}catch (IncorrectCredentialsException e) {
		// TODO: handle exception
		//登陆失败:用户名不存在
		//model.addAttribute("msg", "密码错误");
		//重定向发送  		重定向时不能打包为json
		//return "redirect:/tologin";
		LOGINMESSAGER= ResultFinalString.USERTLOGIN_USER_PSWISWRONG;
	}
	return LOGINMESSAGER;
}

}
