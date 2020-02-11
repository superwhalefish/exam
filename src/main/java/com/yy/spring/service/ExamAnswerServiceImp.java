package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.yy.spring.dao.ExamAnswerDao;
import com.yy.spring.entity.ExamAnswer;

@Service
public class ExamAnswerServiceImp implements ExamAnswerService {
	@Autowired
private ExamAnswerDao examAnswerDao;
	@Override
	public List<ExamAnswer> getExamAnswer(String answerid) {
		// TODO Auto-generated method stub
		return examAnswerDao.selectByAnswerId(answerid);
	}
	@Override
	public Integer updateAnswerById(ExamAnswer examAnswer) {
		// TODO Auto-generated method stub
		return examAnswerDao.updateAnswerById(examAnswer);
	}
	@Override
	public Integer updateAnswerStateById(ExamAnswer examAnswer) {
		// TODO Auto-generated method stub
		return examAnswerDao.updateAnswerStateById(examAnswer);
	}
	/**
	 * 添加试题选项
	 */
	@Override
	public Integer addExamAnswer(String a, String b, String c, String d, String answerid) {
		// TODO Auto-generated method stub
		System.out.println("开始执行");
		System.out.println(a+answerid+b+answerid+c+answerid+d+answerid);
		return examAnswerDao.addExamAnswer(a,answerid,b,answerid,c,answerid,d,answerid);
	}

}
