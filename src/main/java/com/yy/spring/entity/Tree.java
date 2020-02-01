package com.yy.spring.entity;

import java.util.List;

public class Tree {
private Integer id;
private String text;
private String state;
private String path;
private List<Tree> children;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public List<Tree> getChildren() {
	return children;
}
public void setChildren(List<Tree> children) {
	this.children = children;
}
public Tree() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Tree [id=" + id + ", text=" + text + ", state=" + state + ", path=" + path + ", children=" + children + "]";
}


}
