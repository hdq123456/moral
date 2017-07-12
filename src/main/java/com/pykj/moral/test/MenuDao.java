package com.pykj.moral.test;

import java.util.List;

public interface MenuDao {
	/**
	 * 查找用户的菜单
	 * 
	 * @param loginUser
	 * @return
	 */
	public List<Menu> queryMenuList();
}
