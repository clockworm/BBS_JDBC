package com.mick.bbs.entity;

/**
 * 权限
 */
import java.io.Serializable;

public class Privilege implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String action;
	private String resource;

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

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	@Override
	public String toString() {
		return "Privilege [id=" + id + ", name=" + name + ", action=" + action + ", resource=" + resource + "]";
	}
}
