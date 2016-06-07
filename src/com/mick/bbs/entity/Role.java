package com.mick.bbs.entity;

/**
 * 角色
 */
import java.io.Serializable;
import java.util.HashSet;

public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String description; // 角色描述
	private boolean defaultForNewUser; // 新用户是否给默认角色
	private HashSet<User> users = new HashSet<User>();// 角色被那些用户拥有
	private HashSet<Privilege> privileges = new HashSet<Privilege>();// 角色被那些权限拥有

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

	public boolean isDefaultForNewUser() {
		return defaultForNewUser;
	}

	public void setDefaultForNewUser(boolean defaultForNewUser) {
		this.defaultForNewUser = defaultForNewUser;
	}

	public HashSet<User> getUsers() {
		return users;
	}

	public void setUsers(HashSet<User> users) {
		this.users = users;
	}

	public HashSet<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(HashSet<Privilege> privileges) {
		this.privileges = privileges;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
