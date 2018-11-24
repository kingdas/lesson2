package com.yc.java021dao;

import java.util.List;

/**
 * 接口功能的约定
 * 
 * @author Administrator
 * 
 */
public interface UserDao {
	int add(UserModel u);

	int update(UserModel u);

	int del(int id);

	UserModel findById(int id);

	List<UserModel> findAll();

}
