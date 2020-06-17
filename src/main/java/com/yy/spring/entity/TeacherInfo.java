package com.yy.spring.entity;

import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Component
@TableName(value="tacherinfo")
public class TeacherInfo {
private Integer id;
private Integer teacherid;
private String teachername;
private Integer teachergradeid;
private String teachergradename;
private String teachergradeprofession;
private String teacherbirthday;
private String teachersex;
public TeacherInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public TeacherInfo(Integer id, Integer teacherid, String teachername, Integer teachergradeid, String teachergradename,
		String teachergradeprofession, String teacherbirthday, String teachersex) {
	super();
	this.id = id;
	this.teacherid = teacherid;
	this.teachername = teachername;
	this.teachergradeid = teachergradeid;
	this.teachergradename = teachergradename;
	this.teachergradeprofession = teachergradeprofession;
	this.teacherbirthday = teacherbirthday;
	this.teachersex = teachersex;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getTeacherid() {
	return teacherid;
}
public void setTeacherid(Integer teacherid) {
	this.teacherid = teacherid;
}
public String getTeachername() {
	return teachername;
}
public void setTeachername(String teachername) {
	this.teachername = teachername;
}
public Integer getTeachergradeid() {
	return teachergradeid;
}
public void setTeachergradeid(Integer teachergradeid) {
	this.teachergradeid = teachergradeid;
}
public String getTeachergradename() {
	return teachergradename;
}
public void setTeachergradename(String teachergradename) {
	this.teachergradename = teachergradename;
}
public String getTeachergradeprofession() {
	return teachergradeprofession;
}
public void setTeachergradeprofession(String teachergradeprofession) {
	this.teachergradeprofession = teachergradeprofession;
}
public String getTeacherbirthday() {
	return teacherbirthday;
}
public void setTeacherbirthday(String teacherbirthday) {
	this.teacherbirthday = teacherbirthday;
}
public String getTeachersex() {
	return teachersex;
}
public void setTeachersex(String teachersex) {
	this.teachersex = teachersex;
}
@Override
public String toString() {
	return "TeacherInfo [id=" + id + ", teacherid=" + teacherid + ", teachername=" + teachername + ", teachergradeid="
			+ teachergradeid + ", teachergradename=" + teachergradename + ", teachergradeprofession="
			+ teachergradeprofession + ", teacherbirthday=" + teacherbirthday + ", teachersex=" + teachersex + "]";
}

}
