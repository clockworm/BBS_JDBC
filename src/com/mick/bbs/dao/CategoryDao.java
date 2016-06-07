package com.mick.bbs.dao;

import com.mick.bbs.dao.base.Dao;
import com.mick.bbs.entity.Category;

public interface CategoryDao extends Dao<Category> {
	public int getMaxOrder();
}
