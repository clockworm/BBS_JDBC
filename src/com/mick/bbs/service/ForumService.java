package com.mick.bbs.service;

import java.util.List;
import com.mick.bbs.entity.Forum;
import com.mick.bbs.entity.Topic;

public interface ForumService {
	public List<Topic> getTopics(Forum forum);
}
