package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.ExamAnswer;
import com.yy.spring.entity.ExamTotal;
import com.yy.spring.entity.Fenye;

public interface ExamTotalDao extends BaseMapper<ExamTotal> {
/**
 * 获得试卷题目
 * @param fenye
 * @return
 */
	List<ExamTotal> getExamTotalByEid(Fenye<ExamTotal> fenye);

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
/**
 * 根据编号修改答案状态
 * @param answerid
 * @return
 */
Integer updateAnswerstateByAnswerid(ExamAnswer examAnswer);
/**
 * 获得试卷题目数
 * @param fenye
 * @return
 */
Integer getCountExamTotalByEid(Fenye<ExamTotal> fenye);

}
