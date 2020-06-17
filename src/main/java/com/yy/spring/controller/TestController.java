package com.yy.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestController {
	@PostMapping("/test/getMath")
public String getMath(String math) {
	if("1.1".equals(math)) {
		
	}else if ("1.2".equals(math)) {
		
	}else if("2.1".equals(math)) {
		
	}else {
		
	}
	
	return null;
	
}
}
