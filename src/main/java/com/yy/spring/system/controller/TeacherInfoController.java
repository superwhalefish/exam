package com.yy.spring.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.spring.entity.Fenye;
import com.yy.spring.entity.TeacherInfo;
import com.yy.spring.service.TeacherInfoService;

@RestController
public class TeacherInfoController {
	@Autowired
	private TeacherInfoService teacherInfoService;
	@Autowired
	private Fenye<TeacherInfo> fenye;

	@PostMapping("/teacherinfo/selectteacherinfo")
	public Fenye<TeacherInfo> getTeacherInfo(Integer page, Integer rows, TeacherInfo teacherInfo, String minbirthday,
			String maxbirthday) {

		fenye.setTeacherInfo(teacherInfo);
		fenye.setMaxbirthday(maxbirthday);
		fenye.setMinbirthday(minbirthday);
		fenye.setPage((page - 1) * rows);
		fenye.setPageSize(rows);

		System.out.println(page + "  " + rows + "  " + teacherInfo + "  " + minbirthday + "  " + maxbirthday);
		return teacherInfoService.selectTeacherInfo(fenye);

	}
}
