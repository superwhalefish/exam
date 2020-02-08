package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.ExamTotal;

public interface ExamTotalDao extends BaseMapper<ExamTotal>{

	List<ExamTotal> getExamTotalByEid(Integer eid);

}
