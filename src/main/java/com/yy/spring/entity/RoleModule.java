package com.yy.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "rolemodule")
public class RoleModule {
private Integer id;
private Integer rid;
private Integer mid;
public RoleModule() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getRid() {
	return rid;
}
public void setRid(Integer rid) {
	this.rid = rid;
}
public Integer getMid() {
	return mid;
}
public void setMid(Integer mid) {
	this.mid = mid;
}
@Override
public String toString() {
	return "RoleMoudle [id=" + id + ", rid=" + rid + ", mid=" + mid + "]";
}

}
