package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.Exam;

public interface ExamDao extends BaseMapper<Exam>{
/**
 * 获取该类别的试卷
 * @param mid
 * @return
 */
	List<Exam> selectByMid(Integer mid);

}
