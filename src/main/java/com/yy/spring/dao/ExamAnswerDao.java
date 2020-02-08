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
	List<ExamAnswer> selectByAnswerId(Integer answerid);

}
