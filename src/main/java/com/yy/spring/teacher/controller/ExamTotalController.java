package com.yy.spring.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.spring.entity.ExamTotal;
import com.yy.spring.entity.Fenye;
import com.yy.spring.service.ExamTotalService;

@RestController
public class ExamTotalController {
	@Autowired
	private ExamTotalService examTotalService;
	
	@PostMapping("/examTotal/getExamTotal")
	public Fenye<ExamTotal> getExamTotal(Integer eid,Integer page,Integer rows) {
		System.out.println("这是第"+eid+"套试卷的编号");
		Fenye<ExamTotal> fenye=new Fenye();
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		fenye.setEid(eid);
		return examTotalService.getExamTotalByEid(fenye);

	}
	/**
	 * 修改题目
	 * @param examTotal
	 * @return
	 */
	@PostMapping("/ExamTotal/editTotalById")
	public Integer editTotalById(ExamTotal examTotal) {
		return examTotalService.editTotalById(examTotal);
		
	}
	/**
	 * 删除大题
	 * @param id
	 * @return
	 */
	@PostMapping("/ExamTotal/delTotalById")
	public Integer delTotalById(Integer id,String answerid) {
		return examTotalService.delTotalById(id,answerid);
		
	}
}
