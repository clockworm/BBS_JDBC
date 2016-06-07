package com.mick.bbs.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.mick.bbs.dao.PrivilegeDao;
import com.mick.bbs.dao.base.BaseDao;
import com.mick.bbs.entity.Privilege;

public class PrivilegeDaoIMP extends BaseDao implements PrivilegeDao {
	@Override
	public int add(Privilege t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Privilege t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Privilege find(int id) {
		String sql = "select id,name,action,resource from privilege where id=? ORDER BY id";
		Privilege pri = new Privilege();
		try {
			ResultSet res = this.find(id, sql);
			if (res.next()) {
				pri.setId(res.getInt(1));
				pri.setName(res.getString(2));
				pri.setAction(res.getString(3));
				pri.setResource(res.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pri;
	}

	@Override
	public List<Privilege> findMore(Privilege t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Privilege> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Privilege> pageQuery(int count, int page) {
		// TODO Auto-generated method stub
		return null;
	}

}
