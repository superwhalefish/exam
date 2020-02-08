package com.yy.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "examanswer")
public class ExamAnswer {
private Integer id;
private String answer;
private Integer answerstate;
private Integer answerid;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Integer getAnswerstate() {
	return answerstate;
}
public void setAnswerstate(Integer answerstate) {
	this.answerstate = answerstate;
}
public Integer getAnswerid() {
	return answerid;
}
public void setAnswerid(Integer answerid) {
	this.answerid = answerid;
}
public ExamAnswer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ExamAnswer [id=" + id + ", answer=" + answer + ", answerstate=" + answerstate + ", answerid=" + answerid
			+ "]";
}

}
