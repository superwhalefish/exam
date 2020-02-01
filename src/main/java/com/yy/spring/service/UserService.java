package com.yy.spring.service;

import java.util.List;

import org.springframework.ui.Model;

import com.yy.spring.entity.Tree;
import com.yy.spring.entity.User;

public interface UserService {
	/**
	 * 获取全部信息
	 * @return
	 */
User findUserByUserName(String username);
/**
 * 检测用户登陆
 * @param username
 * @param userpassword
 * @param model
 * @return
 */
Integer tologin(String username,String userpassword);
/**
 * 获取权限树
 * @return
 */
List getTree();
}
