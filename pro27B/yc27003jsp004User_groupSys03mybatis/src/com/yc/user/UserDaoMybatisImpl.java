package com.yc.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yc.framework.DbUtils;
import com.yc.group.GroupDao;
import com.yc.group.GroupDaoImpl;
import com.yc.group.GroupModel;

public class UserDaoMybatisImpl implements UserDao {

	SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(Thread
			.currentThread().getContextClassLoader()
			.getResourceAsStream("mybatis.xml"));

	@Override
	public int add(UserModel u) {
		int n = -1;
		SqlSession s = sf.openSession();
		try {
			n = s.insert("com.yc.user.UserDao.add", u);
			s.commit();
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public int update(UserModel u) {
		int n = -1;
		SqlSession s = sf.openSession();
		try {
			n = s.update("com.yc.user.UserDao.update", u);
			s.commit();
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public int del(int id) {
		int n = -1;
		SqlSession s = sf.openSession();
		try {
			n = s.delete("com.yc.user.UserDao.del", id);
			s.commit();
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public UserModel findById(int id) {
		UserModel u = null;
		SqlSession s = sf.openSession();
		try {
			u = s.selectOne("com.yc.user.UserDao.findById", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return u;
	}

	@Override
	public List<UserModel> findAll() {
		List<UserModel> us = null;
		SqlSession s = sf.openSession();
		try {
			us = s.selectList("com.yc.user.UserDao.findAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return us;

	}

	@Override
	public List<UserModel> findAllAll() {
		GroupDao groupDao = new GroupDaoImpl();
		String sql = "select * from t_user";
		List<UserModel> us = DbUtils.executeR(sql, UserModel.class);
		GroupModel gm = null;
		UserModel u = null;
		for (int i = 0; i < us.size(); i++) {
			u = us.get(i);
			gm = groupDao.findById(u.getGroupId());
			u.setGroupModel(gm);
		}
		return us;
	}

}
