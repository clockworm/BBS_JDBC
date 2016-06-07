package com.mick.bbs.service.imp;

import com.mick.bbs.dao.RoleDao;
import com.mick.bbs.entity.Role;
import com.mick.bbs.service.RoleSerivce;

public class RoleSerivceIMP implements RoleSerivce {
	private RoleDao roleDao;

	public RoleSerivceIMP(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public Role getPrivilege(Role role) {
		return roleDao.getPrivileges(role);
	}

}
