package com.yy.spring.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.spring.entity.ExamTotal;
import com.yy.spring.service.ExamTotalService;

@RestController
public class ExamTotalController {
	@Autowired
	private ExamTotalService examTotalService;
	
	@PostMapping("/examTotal/getExamTotal")
	public List<ExamTotal> getExamTotal(Integer eid) {
		System.out.println("这是第"+eid+"套试卷的编号");
		
		return examTotalService.getExamTotalByEid(eid);

	}
}
