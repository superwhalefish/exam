package com.yy.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "examtotal")
public class ExamTotal {
private Integer id;
private String examtotal;
private Integer eid;
private Integer answerid;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getExamtotal() {
	return examtotal;
}
public void setExamtotal(String examtotal) {
	this.examtotal = examtotal;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public Integer getAnswerid() {
	return answerid;
}
public void setAnswerid(Integer answerid) {
	this.answerid = answerid;
}
public ExamTotal() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ExamTotal [id=" + id + ", examtotal=" + examtotal + ", eid=" + eid + ", answerid=" + answerid + "]";
}

}
