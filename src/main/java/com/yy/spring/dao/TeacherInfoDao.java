package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.Fenye;
import com.yy.spring.entity.TeacherInfo;

public interface TeacherInfoDao extends BaseMapper<TeacherInfo>{
	/**
	 * 分页多条件查询
	 * @param fenye
	 * @return
	 */
List<TeacherInfo> selectTeacherInfo(Fenye<TeacherInfo> fenye);
/**
 * 查询页数
 * @param fenye
 * @return
 */
Integer selectTeacherInfoCount(Fenye<TeacherInfo> fenye);
}
