package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.ExamAnswer;

public interface ExamAnswerDao extends BaseMapper<ExamAnswer>{
/**
 * 获取试题选项
 * @param answerid
 * @return
 */
	List<ExamAnswer> selectByAnswerId(String answerid);
/**
 * 修改答案内容信息
 * @param examAnswer
 * @return
 */
Integer updateAnswerById(ExamAnswer examAnswer);
/**
 * 设置试题的正确答案状态
 * @param examAnswer
 * @return
 */
Integer updateAnswerStateById(ExamAnswer examAnswer);
/**
 * 添加试题选项
 * @param a
 * @param answerid
 * @param b
 * @param answerid2
 * @param c
 * @param answerid3
 * @param d
 * @param answerid4
 * @return
 */
Integer addExamAnswer(String a, String answerid, String b, String answerid2, String c, String answerid3, String d,
		String answerid4);
/**
 * 删除选项
 * @param id
 * @return
 */
Integer delAnswerByAnswerId(String answerid);

}
