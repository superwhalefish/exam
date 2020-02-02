package com.yy.spring.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.spring.entity.Exam;
import com.yy.spring.service.ExamService;

@RestController
public class ExamController {
	@Autowired
private ExamService examService; 
	@PostMapping("/exam/getExam")
	public List<Exam> getExam(Integer mid){
		System.out.println(mid);
		return examService.getExam(mid);
		
	}
}
