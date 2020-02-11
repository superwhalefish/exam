package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.ExamTotal;

public interface ExamTotalDao extends BaseMapper<ExamTotal> {

	List<ExamTotal> getExamTotalByEid(Integer eid);

	/**
	 * 添加试题题目
	 * 
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
 * 删除题目
 * @param id
 * @return
 */
Integer delTotalById(Integer id);

}
