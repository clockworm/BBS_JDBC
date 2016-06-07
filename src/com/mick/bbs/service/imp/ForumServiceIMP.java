package com.mick.bbs.service.imp;

import java.util.List;
import com.mick.bbs.dao.TopicDao;
import com.mick.bbs.dao.factory.DaoFactory;
import com.mick.bbs.entity.Forum;
import com.mick.bbs.entity.Topic;
import com.mick.bbs.service.ForumService;

public class ForumServiceIMP implements ForumService {
	private TopicDao topicDao = DaoFactory.getTopicDao();

	@Override
	public List<Topic> getTopics(Forum forum) {
		Topic topic = new Topic();
		topic.setFornum(forum);
		return topicDao.findMore(topic);
	}

}
