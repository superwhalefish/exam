package com.yy.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "module")
public class Module {
private Integer id;
private String module;
private String url;
private Integer parentid;
public Module() {
	super();
	// TODO Auto-generated constructor stub
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getModule() {
	return module;
}

public void setModule(String module) {
	this.module = module;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public Integer getParentid() {
	return parentid;
}

public void setParentid(Integer parentid) {
	this.parentid = parentid;
}

@Override
public String toString() {
	return "Module [id=" + id + ", module=" + module + ", url=" + url + ", parentid=" + parentid + "]";
}




}
