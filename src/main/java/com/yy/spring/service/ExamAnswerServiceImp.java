package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.spring.dao.ExamAnswerDao;
import com.yy.spring.entity.ExamAnswer;

@Service
public class ExamAnswerServiceImp implements ExamAnswerService {
	@Autowired
private ExamAnswerDao examAnswerDao;
	@Override
	public List<ExamAnswer> getExamAnswer(Integer answerid) {
		// TODO Auto-generated method stub
		return examAnswerDao.selectByAnswerId(answerid);
	}

}
