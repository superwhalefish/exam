package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.spring.dao.ExamAnswerDao;
import com.yy.spring.dao.ExamTotalDao;
import com.yy.spring.entity.ExamAnswer;
import com.yy.spring.entity.ExamTotal;
import com.yy.spring.entity.Fenye;

@Service
public class ExamTotalServiceImp implements ExamTotalService {
	@Autowired
	private ExamTotalDao examTotalDao;
	@Autowired
	private ExamAnswerDao examAnswerDao;

	/**
	 * 获取试题大题
	 */
	@Override
	public Fenye<ExamTotal> getExamTotalByEid(Fenye<ExamTotal> fenye) {
		// TODO Auto-generated method stub
		List<ExamTotal> examTotalByEid = examTotalDao.getExamTotalByEid(fenye);
		Integer total=examTotalDao.getCountExamTotalByEid(fenye);
		fenye.setRows(examTotalByEid);
		fenye.setTotal(total);
		return fenye;
	}

	/**
	 * 添加试卷题目
	 */
	@Override
	public Integer addExamTotal(ExamTotal examTotal) {
		// TODO Auto-generated method stub
		System.out.println(examTotal);
		return examTotalDao.addExamTotal(examTotal);
	}
/**
 * 修改题目
 */
	@Override
	public Integer editTotalById(ExamTotal examTotal) {
		// TODO Auto-generated method stub
		return examTotalDao.editTotalById(examTotal);
	}

	@Override
	public Integer delTotalById(Integer id,String answerid) {
		// TODO Auto-generated method stub
		System.out.println("试题删除");
		Integer i=null;
		
		i=examTotalDao.delTotalById(id);
		List<ExamAnswer> selectByAnswerId = examAnswerDao.selectByAnswerId(answerid);
		if(selectByAnswerId.size()>0) {
			i=examAnswerDao.delAnswerByAnswerId(answerid);
		}
	
		return i;
	}


}
