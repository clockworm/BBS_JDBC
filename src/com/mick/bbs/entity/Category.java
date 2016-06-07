package com.mick.bbs.entity;

/**
 * 版块
 */
import java.io.Serializable;

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int order;

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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
