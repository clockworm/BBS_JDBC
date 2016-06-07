package com.mick.bbs.entity;

/**
 * 发帖
 */
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

public class Topic implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String title;
	private String content;
	private Date postTime;
	private String ipAddr;
	private boolean deleted;
	private String typeBelongs;
	private int viewCount;
	private int replyCount;
	private Date lastArticlePostTime;
	private int nextFloor;
	private String summary;
	private User user;
	private Forum forum;
	private Reply lastReply;
	private HashSet<Reply> replys = new HashSet<Reply>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getTypeBelongs() {
		return typeBelongs;
	}

	public void setTypeBelongs(String typeBelongs) {
		this.typeBelongs = typeBelongs;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}

	public Date getLastArticlePostTime() {
		return lastArticlePostTime;
	}

	public void setLastArticlePostTime(Date lastArticlePostTime) {
		this.lastArticlePostTime = lastArticlePostTime;
	}

	public int getNextFloor() {
		return nextFloor;
	}

	public void setNextFloor(int nextFloor) {
		this.nextFloor = nextFloor;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Forum getFornum() {
		return forum;
	}

	public void setFornum(Forum forum) {
		this.forum = forum;
	}

	public HashSet<Reply> getReplys() {
		return replys;
	}

	public void setReplys(HashSet<Reply> replys) {
		this.replys = replys;
	}

	public Reply getLastReply() {
		return lastReply;
	}

	public void setLastReply(Reply lastReply) {
		this.lastReply = lastReply;
	}

}
