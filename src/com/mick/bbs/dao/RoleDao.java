package com.mick.bbs.dao;

import com.mick.bbs.dao.base.Dao;
import com.mick.bbs.entity.Role;

public interface RoleDao extends Dao<Role> {
	// 查询该角色拥有哪些权限
	Role getPrivileges(Role role);
}
