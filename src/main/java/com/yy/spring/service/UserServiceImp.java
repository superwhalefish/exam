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
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		List<User> selectList = userDao.selectList(null);
		return selectList;
	}

}
