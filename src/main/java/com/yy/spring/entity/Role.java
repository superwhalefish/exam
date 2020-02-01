package com.yy.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "role")
public class Role {
private Integer id;
private String role;
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "Role [id=" + id + ", role=" + role + "]";
}


}
