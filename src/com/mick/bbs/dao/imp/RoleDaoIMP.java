package com.mick.bbs.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.mick.bbs.dao.PrivilegeDao;
import com.mick.bbs.dao.RoleDao;
import com.mick.bbs.dao.base.BaseDao;
import com.mick.bbs.dao.factory.DaoFactory;
import com.mick.bbs.entity.Role;
import com.mick.bbs.util.JDBC;

public class RoleDaoIMP extends BaseDao implements RoleDao {
	private PrivilegeDao privilegeDao = DaoFactory.getPrivilegeDao();

	@Override
	public int add(Role t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Role t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Role find(int id) {
		String sql = "select id,name,description,defaultForNewUser from role where id =?";
		Role role = new Role();
		try {
			ResultSet res = this.find(id, sql);
			if (res.next()) {
				role.setId(res.getInt(1));
				role.setName(res.getString(2));
				role.setDescription(res.getString(3));
				role.setDefaultForNewUser(res.getBoolean(4));
			}
			res.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return role;
	}

	@Override
	public List<Role> findMore(Role t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> pageQuery(int count, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getPrivileges(Role role) {
		String sql = "select  privilege_id  from  privilege_role where role_id = ?";
		try {
			ResultSet result = this.find(role.getId(), sql);
			while (result.next()) {
				role.getPrivileges().add(privilegeDao.find(result.getInt(1)));
			}
			result.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC.close();
			JDBC.closeConnection();
		}
		return role;
	}

}
