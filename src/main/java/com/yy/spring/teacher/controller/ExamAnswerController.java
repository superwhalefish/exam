package com.yy.spring.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.spring.entity.ExamAnswer;
import com.yy.spring.service.ExamAnswerService;

@RestController
public class ExamAnswerController {
	@Autowired
private ExamAnswerService examAnswerService;
	@PostMapping("/examAnswer/getgetExamAnswer")
	public List<ExamAnswer> getExamAnswer(Integer answerid){
		System.out.println("这是第"+answerid+"题");
		return examAnswerService.getExamAnswer(answerid);
		
	}
}
