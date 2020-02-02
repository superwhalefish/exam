package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.spring.dao.ExamDao;
import com.yy.spring.entity.Exam;

@Service
public class ExamServiceImp implements ExamService {
	@Autowired
private ExamDao examDao;
	@Override
	public List<Exam> getExam(Integer mid) {
		// TODO Auto-generated method stub
		return examDao.selectByMid(mid);
	}

}
