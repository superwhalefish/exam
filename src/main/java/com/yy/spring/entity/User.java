package com.yy.spring.entity;


import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
@Data
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
}
