package com.mick.bbs.service.imp;

import java.util.List;
import com.mick.bbs.dao.CategoryDao;
import com.mick.bbs.dao.ForumDao;
import com.mick.bbs.dao.factory.DaoFactory;
import com.mick.bbs.entity.Category;
import com.mick.bbs.entity.Forum;
import com.mick.bbs.service.CategoryService;

public class CategoryServiceIMP implements CategoryService {
	private CategoryDao categoryDao = DaoFactory.getCategoryDao();
	private ForumDao forumDao = DaoFactory.getForumDao();

	@Override
	public int addCategory(Category category) {
		return categoryDao.add(category);
	}

	@Override
	public Category find(int id) {
		return categoryDao.find(id);
	}

	@Override
	public List<Forum> getForum(int id) {
		Forum forum = new Forum();
		forum.getCategory().setId(id);
		List<Forum> forums = forumDao.findMore(forum);
		return forums;
	}

	@Override
	public int getMaxOrder() {
		return categoryDao.getMaxOrder();
	}

}
