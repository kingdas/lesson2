package com.yc.java021dao;

import java.util.List;

/**
 * �ӿڹ��ܵ�Լ��
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
