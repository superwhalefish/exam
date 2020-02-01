package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.RoleModule;

public interface RoleModuleDao extends BaseMapper<RoleModule>{
/**
 * 查询角色对应模块编号
 * @param ridList
 * @return
 */
	List<RoleModule> selectByRids(List<Integer> ridList);
}
