package com.yc.user;

import java.util.List;

import com.yc.framework.BaseDao;

/**
 * �ӿڹ��ܵ�Լ��
 * 
 * @author Administrator
 * 
 */
public interface UserDao extends BaseDao<UserModel> {
	public List<UserModel> findAllAll();
}
