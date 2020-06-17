package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.spring.dao.TeacherInfoDao;
import com.yy.spring.entity.Fenye;
import com.yy.spring.entity.TeacherInfo;
@Service
public class TeacherInfoServiceImp implements TeacherInfoService {
	@Autowired
	private TeacherInfoDao teacherInfoDao;

	// 获取教师信息
	@Override
	public Fenye<TeacherInfo> selectTeacherInfo(Fenye<TeacherInfo> fenye) {
		// TODO Auto-generated method stub
		List<TeacherInfo> selectTeacherInfo = teacherInfoDao.selectTeacherInfo(fenye);
		fenye.setRows(selectTeacherInfo);
		Integer selectTeacherInfoCount = teacherInfoDao.selectTeacherInfoCount(fenye);
		fenye.setTotal(selectTeacherInfoCount);
		return fenye;
	}

}
