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
	@PostMapping("/Exam/AddExam")
	public Integer addExam(String answertotal,String A,String B,String C,String D,Integer eid) {
		System.out.println("试卷编号:"+eid);
		System.out.println("题目:"+answertotal);
		System.out.println("A:"+A);
		System.out.println("B:"+B);
		System.out.println("C:"+C);
		System.out.println("D:"+D);
		return examService.addExamTotalAndAnswer(answertotal,A,B,C,D,eid);
		
	}
}
