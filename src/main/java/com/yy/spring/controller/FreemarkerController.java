package com.yy.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreemarkerController {
	@RequestMapping(value="/tologin")
	public String index(Model model) {
		Map<String, Object> map =new HashMap<String, Object>();
		return "login";
	}
	@RequestMapping(value = "/teacher/index")
	public String teacherindex() {
		return "/teacher/index";
	}
	@RequestMapping(value = "/teacher/system")
	public String teachersystem() {
		return "/teacher/system";
		
	}
	
	@RequestMapping(value = "/student/index")
	public String studentindex() {
		return "/student/index";
	}
	@RequestMapping(value = "/student/exam")
	public String studentexam() {
		return "/student/exam";
	}
	@RequestMapping("/noAuth")
	public String noAuth() {
		return "/noAuth";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(String username,String userpassword,Model model) {
		System.out.println(username);
		/**
		 * shiro编写认证
		 */
		//获取subject
		Subject subject = SecurityUtils.getSubject();
		//封装用户数据
		UsernamePasswordToken token =new UsernamePasswordToken(username,userpassword);
		//执行登陆方法
		try {
			subject.login(token);
			//登陆成功
			return "登陆成功";
		} catch (UnknownAccountException e) {
			//登陆失败:用户名不存在
			return "用户名不存在";
			// TODO: handle exception
		}catch (IncorrectCredentialsException e) {
			// TODO: handle exception
			//登陆失败:用户名不存在
			model.addAttribute("msg", "密码错误");
			//重定向发送
			//return "redirect:/tologin";
			return "密码错误";
		}
		
	}
}
