package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yy.spring.dao.ExamAnswerDao;
import com.yy.spring.dao.ExamTotalDao;
import com.yy.spring.entity.ExamAnswer;

@Service
public class ExamAnswerServiceImp implements ExamAnswerService {
	@Autowired
	private ExamAnswerDao examAnswerDao;
	@Autowired
	private ExamTotalDao examTotalDao;

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
	@Transactional
	public Integer updateAnswerStateById(ExamAnswer examAnswer) {
		// TODO Auto-generated method stub
		System.out.println("第一次数据传入"+examAnswer);
		// 修改试题答案状态
		Integer a = null;
		a = examAnswerDao.updateAnswerStateById(examAnswer);
		if (a > 0) {
			// 1 1 1
			System.out.println("数据检查"+examAnswer);
			Integer istrue = examAnswerDao.selectExamAnswerByAnswerId(examAnswer);
			// 设置正确答案时
			System.out.println("查询结果："+istrue);
			System.out.println(examAnswer.getAnswerstate());
			if (examAnswer.getAnswerstate() == 1 && (istrue == 0 || istrue > 0)) {
				System.out.println("答案设置");
				examTotalDao.updateAnswerstateByAnswerid(examAnswer);
			} // 答案未设置
			if (examAnswer.getAnswerstate() == 2 && istrue == 4) {
				//
				System.out.println("答案取消");
				examTotalDao.updateAnswerstateByAnswerid(examAnswer);
			}
		}
		return a;
	}

	/**
	 * 添加试题选项
	 */
	@Override
	public Integer addExamAnswer(String a, String b, String c, String d, String answerid) {
		// TODO Auto-generated method stub
		System.out.println("开始执行");
		System.out.println(a + answerid + b + answerid + c + answerid + d + answerid);
		return examAnswerDao.addExamAnswer(a, answerid, b, answerid, c, answerid, d, answerid);
	}

}
