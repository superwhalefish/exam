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
	//git更新
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
	

}
