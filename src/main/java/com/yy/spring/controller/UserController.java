package com.yy.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yy.spring.entity.Tree;
import com.yy.spring.entity.User;
import com.yy.spring.service.UserService;

@RestController
public class UserController {
	@Autowired
private UserService userService;
	/**
	 * 用户登陆判定
	 * @param username
	 * @param userpassword
	 * @return
	 */
	@RequestMapping("/user/login")
	public Integer login(String username,String userpassword) {
		return userService.tologin(username, userpassword);
	}
	/**
	 * 获取权限树
	 * @return
	 */
	@PostMapping("/user/getTree")
	public List<Tree> getTree(){
		System.out.println("haha ");
		return userService.getTree();
		
	}
	
}
