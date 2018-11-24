package com.yc.group;

import java.util.List;

import com.yc.framework.DbUtils;

public class GroupDaoImpl implements GroupDao {

	@Override
	public int add(GroupModel u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GroupModel u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GroupModel findById(int id) {
		String sql = "select * from t_group where id=" + id;
		List<GroupModel> gs = DbUtils.executeR(sql, GroupModel.class);
		if (gs != null && gs.size() > 0) {
			return gs.get(0);
		}
		return null;
	}

	@Override
	public List<GroupModel> findAll() {
		String sql = "select * from t_group";
		return DbUtils.executeR(sql, GroupModel.class);
	}

}
