package com.yc.user;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) throws Exception {
		// Aa a = new Aa();
		// a.a();

		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(Thread
				.currentThread().getContextClassLoader()
				.getResourceAsStream("mybatis.xml"));
		SqlSession s = sf.openSession();

		UserModel u = new UserModel("xx", "...", 1);
		try {
			s.insert("com.yc.user.UserDao" + ".add", u);// 以对象的方式操作表
			//
			//
			//
			s.commit();// 提交事务
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();// 回滚事务
		} finally {
			s.close();
		}

		System.out.println("ok");

	}

}
