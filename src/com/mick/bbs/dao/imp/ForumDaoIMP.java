package com.mick.bbs.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mick.bbs.dao.ForumDao;
import com.mick.bbs.dao.base.BaseDao;
import com.mick.bbs.entity.Forum;
import com.mick.bbs.util.JDBC;

public class ForumDaoIMP extends BaseDao implements ForumDao {

	@Override
	public int add(Forum forum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Forum forum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Forum find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Forum> findMore(Forum forum) {
		String sql = "select id,name,description,order_,topicCount,articleCount,lastArticePostTime from forum where categoryID=?";
		ArrayList<Forum> forums = new ArrayList<Forum>();
		try {
			ResultSet res = this.findMore(sql, forum.getCategory().getId());
			while (res.next()) {	
				Forum fum = new Forum();
				fum.setId(res.getInt(1));
				fum.setName(res.getString(2));
				fum.setDescription(res.getString(3));
				fum.setOrder(res.getInt(4));
				fum.setTopicCount(res.getInt(5));
				fum.setArticleCount(res.getInt(6));
				fum.setLasArticlePostTime(res.getDate(7));
				forums.add(fum);
			}
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return forums;
	}

	@Override
	public List<Forum> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Forum> pageQuery(int count, int page) {
		// TODO Auto-generated method stub
		return null;
	}
}
