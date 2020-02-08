package com.yy.spring.service;

import java.util.List;

import com.yy.spring.entity.ExamTotal;

public interface ExamTotalService {
/**
 * 获取该试题的大题
 * @param eid
 * @return
 */
	List<ExamTotal> getExamTotalByEid(Integer eid);

}
