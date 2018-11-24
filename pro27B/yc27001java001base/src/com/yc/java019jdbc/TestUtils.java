package com.yc.java019jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TestUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// int n =
		// DbUtils.executeCUD("update t_user set name='张无忌' where id=1");
		// System.out.println(n);

		// System.out.println(DbUtils.getConnection() ==
		// DbUtils.getConnection());
		// ////////////////////////////////////////////
		// Properties p = new Properties();
		// try {
		// p.load(Thread.currentThread().getContextClassLoader()
		// .getResourceAsStream("dbInfo.properties"));
		// } catch (IOException e) {
		// e.printStackTrace();
		// }// 加载配置文件
		// String s = p.getProperty("driver");
		// System.out.println(s);
		// ///////////////////////////////////
		Connection conn = DbUtils.getConnection();
		ResultSet rs = DbUtils.executeR(conn, "select * from t_user");
		// 5.处理结果
		try {
			while (rs.next()) {
				System.out
						.println(rs.getInt("id") + "," + rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtils.release(conn, null, rs);
	}

}
