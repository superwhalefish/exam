package com.yy.spring.service;

import java.util.List;

import com.yy.spring.entity.ExamAnswer;

public interface ExamAnswerService {
/**
 * 获取该试题选项
 * @param answerid
 * @return
 */
	List<ExamAnswer> getExamAnswer(String answerid);
/**
 * 修改答案内容
 * @param examAnswer
 * @return
 */
Integer updateAnswerById(ExamAnswer examAnswer);
/**
 * 设置试题正确答案
 * @param examAnswer
 * @return
 */
Integer updateAnswerStateById(ExamAnswer examAnswer);
/**
 * 添加试题选项
 * @param a
 * @param b
 * @param c
 * @param d
 * @param answerid
 * @return
 */
Integer addExamAnswer(String a, String b, String c, String d, String answerid);

}
