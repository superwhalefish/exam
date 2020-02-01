package com.yy.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.yy.spring.dao.ModuleDao;
import com.yy.spring.dao.RoleModuleDao;
import com.yy.spring.dao.UserDao;
import com.yy.spring.dao.UserRoleDao;
import com.yy.spring.entity.Module;
import com.yy.spring.entity.RoleModule;
import com.yy.spring.entity.Tree;
import com.yy.spring.entity.User;
import com.yy.spring.entity.UserRole;
import com.yy.spring.util.ResultFinalString;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserRoleDao userRoleDao;
	@Autowired
	private RoleModuleDao roleModuleDao;
	@Autowired
	private ModuleDao moduleDao;

	/**
	 * 根据账户查询
	 */
	@Override
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		User selectList = userDao.selectByUsername(username);
		return selectList;
	}

	/**
	 * 用户登陆
	 */
	@Override
	public Integer tologin(String username, String userpassword) {
		// TODO Auto-generated method stub
		/**
		 * shiro编写认证
		 */
		// 获取subject
		Subject subject = SecurityUtils.getSubject();
		// 封装用户数据
		UsernamePasswordToken token = new UsernamePasswordToken(username, userpassword);
		// 执行登陆方法
		Integer LOGINMESSAGER = null;

		try {
			subject.login(token);
			if (ResultFinalString.USERTLOGIN_STUDENTFIRSTANDSCEND.equals(username.substring(0, 2))) {
				LOGINMESSAGER = ResultFinalString.USERTLOGINLOGIN_STUDENT;
			}
			if (ResultFinalString.USERTLOGIN_TECAHERFIRSTANDSCEND.equals(username.substring(0, 2))) {
				LOGINMESSAGER = ResultFinalString.USERTLOGINLOGINSUCCESS_TEACHER;
			}
		} catch (UnknownAccountException e) {
			// 登陆失败:用户名不存在
			LOGINMESSAGER = ResultFinalString.USERTLOGIN_USER_ISNULL;
			// TODO: handle exception
		} catch (IncorrectCredentialsException e) {
			// TODO: handle exception
			// 登陆失败:用户名不存在
			// model.addAttribute("msg", "密码错误");
			// 重定向发送 重定向时不能打包为json
			// return "redirect:/tologin";
			LOGINMESSAGER = ResultFinalString.USERTLOGIN_USER_PSWISWRONG;
		}
		return LOGINMESSAGER;
	}

	/**
	 * 获取权限树
	 */
	@Override
	public List getTree() {
		// TODO Auto-generated method stub
		// 获取当前用户编号信息
		Subject subject = SecurityUtils.getSubject();
		int uid = (int) subject.getPrincipal();
		// 权限树的构架
		// 获取用户权限编号
		List<UserRole> selectByUid = userRoleDao.selectByUid(uid);
		// List<UserRole> selectByUid = userRoleDao.selectByUid(3);
		List<Integer> ridList = new ArrayList<Integer>();
		for (int i = 0; i < selectByUid.size(); i++) {
			ridList.add(selectByUid.get(i).getRid());
		}
		System.out.println("获取用户权限编号:" + selectByUid);
		// 获取模板编号
		List<RoleModule> selectByRids = roleModuleDao.selectByRids(ridList);
		List<Integer> midList = new ArrayList<Integer>();
		for (int i = 0; i < selectByRids.size(); i++) {
			midList.add(selectByRids.get(i).getMid());
		}
		// 获取模板

		List<Module> module = moduleDao.selectByMid(midList);
		System.out.println("获取模板:" + module);
		List parentTreeList = new ArrayList();
		for (int i = 0; i < module.size(); i++) {
			if (module.get(i).getParentid() == 0) {
				List<Tree> chirdenTreelist = new ArrayList<Tree>();
				Tree parentTree = new Tree();
				parentTree.setId(module.get(i).getId());
				parentTree.setText(module.get(i).getModule());
				parentTree.setState("closed");
				System.out.println("父状树：" + parentTree);
				for (int j = 0; j < module.size(); j++) {
					if (module.get(j).getParentid() == module.get(i).getId()) {
						Tree chirdenTree = new Tree();
						chirdenTree.setId(module.get(j).getId());
						chirdenTree.setText(module.get(j).getModule());
						chirdenTree.setPath(module.get(j).getUrl());
						System.out.println("子状树：" + chirdenTree);
						chirdenTreelist.add(chirdenTree);
					}
					System.out.println("孩子集合：" + chirdenTreelist);
				}
				parentTree.setChildren(chirdenTreelist);
				parentTreeList.add(parentTree);
				System.out.println("树状架构：" + parentTreeList);
			}
		}

		return parentTreeList;
	}

}
