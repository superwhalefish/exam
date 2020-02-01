package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.UserRole;

public interface UserRoleDao extends BaseMapper<UserRole>{
/**
 * 查询当前用户所具有权限
 * @param uid
 * @return
 */
	List<UserRole> selectByUid(Integer uid);
}
