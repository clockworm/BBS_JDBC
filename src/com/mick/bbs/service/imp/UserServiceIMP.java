package com.mick.bbs.service.imp;

import java.util.ArrayList;
import java.util.List;
import com.mick.bbs.dao.RoleDao;
import com.mick.bbs.dao.UserDao;
import com.mick.bbs.dao.factory.DaoFactory;
import com.mick.bbs.entity.Role;
import com.mick.bbs.entity.User;
import com.mick.bbs.service.UserService;

public class UserServiceIMP implements UserService {
	private UserDao userDao;
	private RoleDao roleDao = DaoFactory.getRoleDao();

	public UserServiceIMP(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean checkLoginName(String name) {
		User user = new User();
		user.setUsername(name);
		List<User> users = userDao.findMore(user);
		if (users.size() == 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(String email) {
		User user = new User();
		user.setEmail(email);
		List<User> users = userDao.findMore(user);
		if (users.size() == 0) {
			return false;
		}
		return true;
	}

	@Override
	public User login(String name, String password) {
		User user = new User();
		user.setUsername(name);
		user.setPassword(password);
		List<User> users = userDao.findMore(user);
		if (users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

	@Override
	public int register(User user) {
		int flag = userDao.add(user);
		return flag;
	}

	@Override
	public User changePassWord(User user, String newpassword) {
		String oldpassword = user.getPassword();
		user.setPassword(newpassword);
		int flag = userDao.update(user);
		if (flag > 0)
			user.setPassword(newpassword);
		else
			user.setPassword(oldpassword);
		return user;
	}

	@Override
	public User getRole(User user) {
		ArrayList<Integer> roleids = (ArrayList<Integer>) userDao.getRoleID(user);
		for (Integer roleid : roleids) {
			Role role = roleDao.find(roleid);
			user.getRoles().add(role);
		}
		return user;
	}
}
