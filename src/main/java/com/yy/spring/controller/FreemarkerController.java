package com.yy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreemarkerController {
	@RequestMapping(value="/index")
	public String index( ) {
		return "login";
	}
}
