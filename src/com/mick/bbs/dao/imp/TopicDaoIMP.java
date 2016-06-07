package com.mick.bbs.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mick.bbs.dao.TopicDao;
import com.mick.bbs.dao.base.BaseDao;
import com.mick.bbs.entity.Topic;
import com.mick.bbs.util.JDBC;

public class TopicDaoIMP extends BaseDao implements TopicDao {

	@Override
	public int add(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Topic find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topic> findMore(Topic topic) {
		String sql = "select id,title,content,postTime,ipAddr,typeBelongs,summary,viewCount,replyCount,lastArticlePostTime,nextFloor from topic where forumID=?";
		ArrayList<Topic> topics = new ArrayList<Topic>();
		try {
			ResultSet res = this.findMore(sql, topic.getFornum().getId());
			while (res.next()) {
				Topic top = new Topic();
				top.setId(res.getInt(1));
				top.setTitle(res.getString(2));
				top.setContent(res.getString(3));
				top.setPostTime(res.getDate(4));
				top.setIpAddr(res.getString(5));
				top.setTypeBelongs(res.getString(6));
				top.setSummary(res.getString(7));
				top.setViewCount(res.getInt(8));
				top.setReplyCount(res.getInt(9));
				top.setLastArticlePostTime(res.getDate(10));
				top.setNextFloor(res.getInt(11));
				topics.add(top);
			}
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return topics;
	}

	@Override
	public List<Topic> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topic> pageQuery(int count, int page) {
		// TODO Auto-generated method stub
		return null;
	}

}
