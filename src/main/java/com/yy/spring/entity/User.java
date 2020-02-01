package com.yy.spring.entity;


import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "user")
public class User {
	private Integer id;
	private String username;
	private String userpassword;
	private String creattime;
	private String logintime;
	private Integer misstimes;
	private String locktime;
	private String lockstate;
	private String email;
	private String uimg;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getCreattime() {
		return creattime;
	}
	public void setCreattime(String creattime) {
		this.creattime = creattime;
	}
	public String getLogintime() {
		return logintime;
	}
	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}
	public Integer getMisstimes() {
		return misstimes;
	}
	public void setMisstimes(Integer misstimes) {
		this.misstimes = misstimes;
	}
	public String getLocktime() {
		return locktime;
	}
	public void setLocktime(String locktime) {
		this.locktime = locktime;
	}
	public String getLockstate() {
		return lockstate;
	}
	public void setLockstate(String lockstate) {
		this.lockstate = lockstate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUimg() {
		return uimg;
	}
	public void setUimg(String uimg) {
		this.uimg = uimg;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", userpassword=" + userpassword + ", creattime="
				+ creattime + ", logintime=" + logintime + ", misstimes=" + misstimes + ", locktime=" + locktime
				+ ", lockstate=" + lockstate + ", email=" + email + ", uimg=" + uimg + "]";
	}
	
}
