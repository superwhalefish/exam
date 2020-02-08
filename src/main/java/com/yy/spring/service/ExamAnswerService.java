package com.yy.spring.service;

import java.util.List;

import com.yy.spring.entity.ExamAnswer;

public interface ExamAnswerService {
/**
 * 获取该试题选项
 * @param answerid
 * @return
 */
	List<ExamAnswer> getExamAnswer(Integer answerid);

}
