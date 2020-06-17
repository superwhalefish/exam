package com.yy.spring.service;

import java.util.List;

import com.yy.spring.entity.Fenye;
import com.yy.spring.entity.TeacherInfo;

public interface TeacherInfoService {
	/**
	 * 分页多条件查询
	 * @param fenye
	 * @return
	 */
Fenye<TeacherInfo> selectTeacherInfo(Fenye<TeacherInfo> fenye);
}
