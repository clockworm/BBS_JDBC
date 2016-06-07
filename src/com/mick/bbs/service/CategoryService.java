package com.mick.bbs.service;

import java.util.List;

import com.mick.bbs.entity.Category;
import com.mick.bbs.entity.Forum;

public interface CategoryService {
	// 添加主板块
	public int addCategory(Category category);

	public Category find(int id);

	public List<Forum> getForum(int id);
	//查询最大
	public int getMaxOrder();
}
