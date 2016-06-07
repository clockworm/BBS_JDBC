package com.mick.bbs.service;

import com.mick.bbs.entity.User;

public interface UserService {
	// 用戶名不能重複登錄
	boolean checkLoginName(String name);

	// 郵箱不能重複
	boolean checkEmail(String email);

	// 登錄
	User login(String name, String password);

	// 用户注册
	int register(User user);

	// 修改密码
	User changePassWord(User user, String password);

	// 查看该用户的角色
	User getRole(User user);

}
