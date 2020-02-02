package com.yy.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "exam")
public class Exam {
private Integer id;
private String ename;
private String estarttime;
private String eendtime;
private Integer mid;
private Integer estate;
public Exam() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEstarttime() {
	return estarttime;
}
public void setEstarttime(String estarttime) {
	this.estarttime = estarttime;
}
public String getEendtime() {
	return eendtime;
}
public void setEendtime(String eendtime) {
	this.eendtime = eendtime;
}
public Integer getMid() {
	return mid;
}
public void setMid(Integer mid) {
	this.mid = mid;
}

public Integer getEstate() {
	return estate;
}
public void setEstate(Integer estate) {
	this.estate = estate;
}
@Override
public String toString() {
	return "Exam [id=" + id + ", ename=" + ename + ", estarttime=" + estarttime + ", eendtime=" + eendtime + ", mid="
			+ mid + ", estate=" + estate + "]";
}

}
