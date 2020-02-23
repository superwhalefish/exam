package com.yy.spring.service;

import java.util.List;

import com.yy.spring.entity.ExamTotal;
import com.yy.spring.entity.Fenye;

public interface ExamTotalService {
/**
 * 获取该试题的大题
 * @param eid
 * @return
 */
	Fenye<ExamTotal> getExamTotalByEid(Fenye<ExamTotal> fenye);
/**
 * 添加试题题目
 * @param examTotal
 * @return
 */
Integer addExamTotal(ExamTotal examTotal);
/**
 * 修改题目
 * @param examTotal
 * @return
 */
Integer editTotalById(ExamTotal examTotal);
/**
 * 删除大题
 * @param id
 * @return
 */
Integer delTotalById(Integer id,String answerid);

}
