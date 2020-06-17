package com.yy.spring.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Fenye<T> {
private Integer page;
private Integer pageSize;
private Integer total;
private List<T> rows;


//试卷编号
private Integer eid;
//最大时间
private String maxbirthday;
//最小时间
private String minbirthday;
//教师信息
private TeacherInfo teacherInfo;
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public Integer getPage() {
	return page;
}
public void setPage(Integer page) {
	this.page = page;
}
public Integer getPageSize() {
	return pageSize;
}
public void setPageSize(Integer pageSize) {
	this.pageSize = pageSize;
}
public Integer getTotal() {
	return total;
}
public void setTotal(Integer total) {
	this.total = total;
}
public List<T> getRows() {
	return rows;
}
public void setRows(List<T> rows) {
	this.rows = rows;
}
public String getMaxbirthday() {
	return maxbirthday;
}
public void setMaxbirthday(String maxbirthday) {
	this.maxbirthday = maxbirthday;
}
public String getMinbirthday() {
	return minbirthday;
}
public void setMinbirthday(String minbirthday) {
	this.minbirthday = minbirthday;
}
public TeacherInfo getTeacherInfo() {
	return teacherInfo;
}
public void setTeacherInfo(TeacherInfo teacherInfo) {
	this.teacherInfo = teacherInfo;
}

}
