package com.yy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.spring.dao.UserDao;
import com.yy.spring.entity.User;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;
/**
 * 根据账户查询
 */
	@Override
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		System.out.println(2);
		User selectList = userDao.selectByUsername(username);
		System.out.println(1);
		return selectList;
	}

}
