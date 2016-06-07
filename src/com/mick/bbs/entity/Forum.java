package com.mick.bbs.entity;

/**
 * 子版块
 */
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

public class Forum implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String description;
	private Date lasArticlePostTime;
	private int order;
	private int topicCount;
	private int articleCount;
	private Category category;
	private Topic lastTopic;
	private HashSet<Topic> Topics = new HashSet<Topic>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getTopicCount() {
		return topicCount;
	}

	public void setTopicCount(int topicCount) {
		this.topicCount = topicCount;
	}

	public int getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}

	public Date getLasArticlePostTime() {
		return lasArticlePostTime;
	}

	public void setLasArticlePostTime(Date lasArticlePostTime) {
		this.lasArticlePostTime = lasArticlePostTime;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Topic getLastTopic() {
		return lastTopic;
	}

	public void setLastTopic(Topic lastTopic) {
		this.lastTopic = lastTopic;
	}

	public HashSet<Topic> getTopics() {
		return Topics;
	}

	public void setTopics(HashSet<Topic> topics) {
		Topics = topics;
	}

}
