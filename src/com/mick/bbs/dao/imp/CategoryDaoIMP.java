package com.mick.bbs.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mick.bbs.dao.CategoryDao;
import com.mick.bbs.dao.base.BaseDao;
import com.mick.bbs.entity.Category;
import com.mick.bbs.util.JDBC;

public class CategoryDaoIMP extends BaseDao implements CategoryDao {

	@Override
	public int add(Category category) {
		String sql = "insert into category values(?,?,?) ";
		int flag = 0;
		try {
			flag = this.add(sql, category.getId(), category.getName(), category.getOrder());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return flag;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Category find(int id) {
		String sql = "select id,name,order_ from category where id=?";
		Category category = new Category();
		try {
			ResultSet res = this.find(id, sql);
			if (res.next()) {
				category.setId(res.getInt(1));
				category.setName(res.getString(2));
				category.setOrder(res.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return category;
	}

	@Override
	public List<Category> findMore(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> pageQuery(int count, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxOrder() {
		String sql = "select max(order_) from category";
		int maxNum = 0;
		try {
			ResultSet res = this.Query(sql);
			if (res.next()) {
				maxNum = res.getInt(1);
			}
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return maxNum + 1;
	}

}
