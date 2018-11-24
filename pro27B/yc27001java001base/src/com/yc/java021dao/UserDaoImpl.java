package com.yc.java021dao;

import java.util.List;

import com.yc.framework.DbUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public int add(UserModel u) {
		String sql = "insert into t_user(name,remark,groupId)values('"
				+ u.getName() + "','" + u.getRemark() + "'," + u.getGroupId()
				+ ")";
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int update(UserModel u) {
		String sql = "update t_user set name='" + u.getName() + "',remark='"
				+ u.getRemark() + "',groupId=" + u.getGroupId() + " where id="
				+ u.getId() + "";
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserModel findById(int id) {
		String sql = "select * from t_user where id=" + id + "";
		List<UserModel> us = DbUtils.executeR(sql, UserModel.class);
		if (us.size() > 0) {
			return us.get(0);
		}
		return null;
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
