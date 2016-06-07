package com.mick.bbs.service;

import com.mick.bbs.entity.Role;

public interface RoleSerivce {
	// 查看该角色拥有哪些权限
	public Role getPrivilege(Role role);
}
