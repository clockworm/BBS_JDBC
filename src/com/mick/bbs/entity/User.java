package com.mick.bbs.entity;
/**
 * 用户
 */
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String username;
	private String password;
	private String email;
	private String nickname;
	private String gender;
	private Date registrationTime;
	private Date lastvisitTime;
	private String lastvisitIP;
	private int topicCount; // 主题数
	private int articleCount; // 回帖数和發帖數
	private boolean islock;// 是否禁用
	private String autologinAuthKey; // 自动登录验证
	// 用户拥有哪些角色
	private HashSet<Role> roles = new HashSet<Role>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}

	public Date getLastvisitTime() {
		return lastvisitTime;
	}

	public void setLastvisitTime(Date lastvisitTime) {
		this.lastvisitTime = lastvisitTime;
	}

	public String getLastvisitIP() {
		return lastvisitIP;
	}

	public void setLastvisitIP(String lastvisitIP) {
		this.lastvisitIP = lastvisitIP;
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

	public boolean isIslock() {
		return islock;
	}

	public void setIslock(boolean islock) {
		this.islock = islock;
	}

	public String getAutologinAuthKey() {
		return autologinAuthKey;
	}

	public void setAutologinAuthKey(String autologinAuthKey) {
		this.autologinAuthKey = autologinAuthKey;
	}

	public HashSet<Role> getRoles() {
		return roles;
	}

	public void setRoles(HashSet<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email;
	}
}
