package com.yy.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

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
	//teacher页面跳转
	//语文
	@RequestMapping("/teacher/yuwen")
	public String yuwen(Integer mid,Model model) {
		System.out.println(mid);
		model.addAttribute("mid", mid);
		return "/teacher/yuwen";
	}
	@RequestMapping(value = "/teacher/exam")
	public String teacherexam(Integer eid,String ename,Model model) {
		System.out.println("试卷编号"+eid);
		System.out.println("试卷名称"+ename);
		model.addAttribute("eid", eid);
		model.addAttribute("emamname", ename);
		return "/teacher/exam";
	}
	//数学
	@RequestMapping("/teacher/shuxue")
	public String shuxue() {
		return "/teacher/shuxue";
	}

}
