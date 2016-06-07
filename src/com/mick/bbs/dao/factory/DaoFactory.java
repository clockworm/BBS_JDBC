package com.mick.bbs.dao.factory;

import com.mick.bbs.dao.*;
import com.mick.bbs.util.ReadUtil;

public class DaoFactory {
	public static UserDao getUserDao() {
		try {
			return (UserDao) Class.forName(ReadUtil.getDao("userDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static RoleDao getRoleDao() {
		try {
			return (RoleDao) Class.forName(ReadUtil.getDao("roleDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static PrivilegeDao getPrivilegeDao() {
		try {
			return (PrivilegeDao) Class.forName(ReadUtil.getDao("privilegeDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static CategoryDao getCategoryDao() {
		try {
			return (CategoryDao) Class.forName(ReadUtil.getDao("categoryDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static ForumDao getForumDao() {
		try {
			return (ForumDao) Class.forName(ReadUtil.getDao("forumDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static TopicDao getTopicDao() {
		try {
			return (TopicDao) Class.forName(ReadUtil.getDao("topicDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
