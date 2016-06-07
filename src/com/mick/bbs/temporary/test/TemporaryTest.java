package com.mick.bbs.temporary.test;

import java.util.HashSet;
import com.mick.bbs.dao.factory.DaoFactory;
import com.mick.bbs.entity.Category;
import com.mick.bbs.entity.Privilege;
import com.mick.bbs.entity.Role;
import com.mick.bbs.entity.User;
import com.mick.bbs.service.imp.CategoryServiceIMP;
import com.mick.bbs.service.imp.RoleSerivceIMP;
import com.mick.bbs.service.imp.UserServiceIMP;

public class TemporaryTest {
	public static void main(String[] args) {
		UserServiceIMP userService = new UserServiceIMP(DaoFactory.getUserDao());
		RoleSerivceIMP roleService = new RoleSerivceIMP(DaoFactory.getRoleDao());
		User user = userService.login("zhangsan", "123456");
		user = userService.getRole(user);
		HashSet<Role> roles = user.getRoles();
		for (Role role : roles) {
			HashSet<Privilege> privileges = roleService.getPrivilege(role).getPrivileges();
			for (Privilege privilege : privileges) {
				System.out.println(privilege);
			}
		}

		CategoryServiceIMP categoryService = new CategoryServiceIMP();
		int max = categoryService.getMaxOrder();
		System.out.println(max);
		
//		 Category category = new Category();
//		 category.setId(4);
//		 category.setName("RUBY");
//		 category.setOrder(4);
//		 categoryService.addCategory(category);
	}
}
