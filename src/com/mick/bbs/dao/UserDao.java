package com.mick.bbs.dao;

import java.util.List;
import com.mick.bbs.dao.base.Dao;
import com.mick.bbs.entity.User;

public interface UserDao extends Dao<User> {
	// 查询该用户用户哪些权限
	public List<Integer> getRoleID(User user);
}