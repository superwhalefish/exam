package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.spring.dao.ExamTotalDao;
import com.yy.spring.entity.ExamTotal;

@Service
public class ExamTotalServiceImp implements ExamTotalService {
	@Autowired
	private ExamTotalDao examTotalDao;
/**
 * 获取试题大题
 */
	@Override
	public List<ExamTotal> getExamTotalByEid(Integer eid) {
		// TODO Auto-generated method stub
		
		return examTotalDao.getExamTotalByEid(eid);
	}

}
