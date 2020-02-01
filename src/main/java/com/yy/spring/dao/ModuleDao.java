package com.yy.spring.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.spring.entity.Module;

public interface ModuleDao extends BaseMapper<Module>{
/**
 * 获取模板
 * @param midList
 * @return
 */
	List<Module> selectByMid(List<Integer> midList);

}
