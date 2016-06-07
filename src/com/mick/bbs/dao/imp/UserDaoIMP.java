package com.mick.bbs.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mick.bbs.dao.UserDao;
import com.mick.bbs.dao.base.BaseDao;
import com.mick.bbs.entity.User;
import com.mick.bbs.util.JDBC;

public class UserDaoIMP extends BaseDao implements UserDao {

	@Override
	public int add(User user) {
		String sql = "insert into bbs_user(id,username,password,email) values(?,?,?,?);";
		int flag = 0;
		try {
			flag = this.add(sql, user.getId(), user.getUsername(), user.getPassword(), user.getEmail());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return flag;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User user) {
		String sql = "update bbs_user set password=? where id=?";
		int flag = 0;
		try {
			flag = this.update(sql, user.getPassword(), user.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return flag;
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findMore(User user) {
		StringBuilder sql = new StringBuilder(
				"select id,username,password,email,nickname,gender,registrationTime,lastvisitTime,lastvisitIP,topicCount,articleCount,locked,autologinAuthKey from bbs_user where 1=1 ");
		ArrayList<Object> list = new ArrayList<Object>();
		if (user != null) {
			String username = user.getUsername();
			String password = user.getPassword();
			String email = user.getEmail();
			String nickname = user.getNickname();
			String gender = user.getGender();
			boolean islock = user.isIslock();
			// Date registrationTime = user.getRegistrationTime();
			// Date lastvisitTime = user.getLastvisitTime();
			// String lastvisitIP = user.getLastvisitIP();
			// int topicCount = user.getTopicCount();
			// int articleCount = user.getArticleCount();
			// String autologinAuthKey = user.getAutologinAuthKey();
			if (username != null && !"".equals(username)) {
				sql.append(" and username=?");
				list.add(username);
			}
			if (password != null && !"".equals(password)) {
				sql.append(" and password=?");
				list.add(password);
			}
			if (email != null && !"".equals(email)) {
				sql.append(" and email=?");
				list.add(email);
			}
			if (nickname != null && !"".equals(nickname)) {
				sql.append(" and nickname=?");
				list.add(nickname);
			}

			if (gender != null && !"".equals(gender)) {
				sql.append(" and gender=?");
				list.add(gender);
			}

			if ("".equals(islock)) {
				sql.append(" and islock=?");
				list.add(islock);
			}
		}
		Object[] objs = new Object[list.size()];
		for (int i = 0; i < list.size(); i++) {
			objs[i] = list.get(i);
		}
		ArrayList<User> users = new ArrayList<User>();
		try {
			ResultSet result = this.findMore(sql.toString(), objs);
			while (result.next()) {
				User u = new User();
				u.setId(result.getInt(1));
				u.setUsername(result.getString(2));
				u.setPassword(result.getString(3));
				u.setEmail(result.getString(4));
				u.setNickname(result.getString(5));
				u.setGender(result.getString(6));
				u.setRegistrationTime(result.getDate(7));
				u.setLastvisitIP(result.getString(8));
				u.setTopicCount(result.getInt(9));
				u.setArticleCount(result.getInt(10));
				u.setIslock(result.getBoolean(12));
				u.setAutologinAuthKey(result.getString(13));
				users.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return users;
	}

	@Override
	public List<User> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> pageQuery(int count, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> getRoleID(User user) {
		String sql = "select roleid from user_role where userid=?";
		ArrayList<Integer> roleids = new ArrayList<Integer>();
		try {
			ResultSet res = this.find(user.getId(), sql);
			while (res.next()) {
				roleids.add(res.getInt(1));
			}
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return roleids;
	}

}
