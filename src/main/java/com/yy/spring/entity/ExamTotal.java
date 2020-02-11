package com.yy.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "examtotal")
public class ExamTotal {
private Integer id;
private String examtotal;
private Integer eid;
private String answerid;
private Integer answerstate;

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

public String getAnswerid() {
	return answerid;
}

public void setAnswerid(String answerid) {
	this.answerid = answerid;
}

public Integer getAnswerstate() {
	return answerstate;
}

public void setAnswerstate(Integer answerstate) {
	this.answerstate = answerstate;
}

public ExamTotal() {
	super();
	// TODO Auto-generated constructor stub
}

public ExamTotal(String examtotal, Integer eid, String answerid, Integer answerstate) {
	super();
	this.examtotal = examtotal;
	this.eid = eid;
	this.answerid = answerid;
	this.answerstate = answerstate;
}

@Override
public String toString() {
	return "ExamTotal [id=" + id + ", examtotal=" + examtotal + ", eid=" + eid + ", answerid=" + answerid
			+ ", answerstate=" + answerstate + "]";
}

}
