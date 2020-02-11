package com.yy.spring.service;

import java.util.List;

import com.yy.spring.entity.Exam;

public interface ExamService {

	List<Exam> getExam(Integer mid);
/**
 * 添加试卷内容
 * @param answertotal
 * @param a
 * @param b
 * @param c
 * @param d
 * @param eid
 * @return
 */
	Integer addExamTotalAndAnswer(String answertotal, String a, String b, String c, String d, Integer eid);

}
