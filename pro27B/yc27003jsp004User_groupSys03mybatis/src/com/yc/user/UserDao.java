package com.yc.user;

import java.util.List;

import com.yc.framework.BaseDao;

/**
 * 接口功能的约定
 * 
 * @author Administrator
 * 
 */
public interface UserDao extends BaseDao<UserModel> {
	public List<UserModel> findAllAll();
}
