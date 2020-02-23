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
	/**
	 * 获取大题
	 * @param answerid
	 * @return
	 */
	@PostMapping("/examAnswer/getgetExamAnswer")
	public List<ExamAnswer> getExamAnswer(String answerid){
		System.out.println("这是第"+answerid+"题");
		return examAnswerService.getExamAnswer(answerid);
		
	}
	/**
	 * 修改答案内容
	 * @return
	 */
	@PostMapping("/ExamAnswer/updateAnswerById")
	public Integer updateAnswerById(ExamAnswer examAnswer) {
		System.out.println(examAnswer);
		return examAnswerService.updateAnswerById(examAnswer);
		
	}
	/**
	 * 设置试题正确答案
	 * @param examAnswer
	 * @return
	 */
	@PostMapping("/ExamAnswer/updateAnswerStateById")
	public Integer updateAnswerStateById(ExamAnswer examAnswer) {
		System.out.println("数据测试"+examAnswer);
		return examAnswerService.updateAnswerStateById(examAnswer);
		
	}
}
