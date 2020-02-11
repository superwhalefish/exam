package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yy.spring.dao.ExamDao;
import com.yy.spring.entity.Exam;
import com.yy.spring.entity.ExamTotal;
import com.yy.spring.util.FormatterTimeString;
import com.yy.spring.util.ResultFinalString;

@Service
public class ExamServiceImp implements ExamService {
	@Autowired
	private ExamDao examDao;
	@Autowired
	private ExamTotalService examTotalService;
	@Autowired
	private ExamAnswerService examAnswerService;

	@Override
	public List<Exam> getExam(Integer mid) {
		// TODO Auto-generated method stub
		return examDao.selectByMid(mid);
	}

	/**
	 * 添加试卷内容
	 */
	@Override
	@Transactional
	public Integer addExamTotalAndAnswer(String answertotal, String a, String b, String c, String d, Integer eid) {
		// TODO Auto-generated method stub
		String answerid = new FormatterTimeString().getNewTimeString();
		ExamTotal examTotal = new ExamTotal();
		examTotal.setId(0);	
		examTotal.setExamtotal(answertotal);
		examTotal.setEid(eid);
		examTotal.setAnswerid(answerid);
		examTotal.setAnswerstate(2);
		Integer message=null;
		Integer addExamTotal = examTotalService.addExamTotal(examTotal);
		Integer examansweristrue = examAnswerService.addExamAnswer(a, b, c, d, answerid);
//		System.out.println("第一个值"+addExamTotal);
//		System.out.println("第二个值"+examansweristrue);
		if(addExamTotal>0&&examansweristrue>0) {
			message=1;
		}else {
			message=0;
		}
		return message;
	}

}
