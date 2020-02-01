package com.yy.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "userrole")
public class UserRole {
private Integer id;
private Integer uid;
private Integer rid;
public UserRole() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public Integer getRid() {
	return rid;
}
public void setRid(Integer rid) {
	this.rid = rid;
}
@Override
public String toString() {
	return "UserRole [id=" + id + ", uid=" + uid + ", rid=" + rid + "]";
}

}
