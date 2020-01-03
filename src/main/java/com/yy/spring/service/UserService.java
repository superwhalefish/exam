package com.yy.spring.service;

import java.util.List;

import com.yy.spring.entity.User;

public interface UserService {
	/**
	 * 获取全部信息
	 * @return
	 */
List<User> getUser();
}
