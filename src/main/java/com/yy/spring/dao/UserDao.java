package com.yy.spring.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.User;

public interface UserDao extends BaseMapper<User>{
/**
 * 根据账户查询
 * @param username
 * @return
 */
	User selectByUsername(String username);

}
