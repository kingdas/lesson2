package com.yc.java019jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbUtils {
	private static final String DRIVER;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;

	/**
	 * ע������
	 */
	static {
		Properties p = new Properties();
		try {
			p.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("dbInfo.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		DRIVER = p.getProperty("driver");
		URL = p.getProperty("url");
		USERNAME = p.getProperty("username");
		PASSWORD = p.getProperty("password");
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("����ע��ʧ��");
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ���ݿ�����Ӷ���
	 * 
	 * @return ���Ӷ���
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * ִ�в�ѯ
	 * 
	 * @param sql
	 * @return �����
	 */
	public static ResultSet executeR(String sql) {
		ResultSet rs = null;
		try {
			Connection conn = getConnection();
			Statement stat = conn.createStatement();
			rs = stat.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * ִ�в�ѯ
	 * 
	 * @param sql
	 * @return �����
	 */
	public static ResultSet executeR(Connection conn, String sql) {
		ResultSet rs = null;
		try {
			Statement stat = conn.createStatement();
			rs = stat.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * ִ����ɾ��
	 * 
	 * @param sql
	 * @return ��Ӱ�������
	 */
	public static int executeCUD(String sql) {
		int n = 0;
		Connection conn = null;
		Statement stat = null;
		try {
			conn = getConnection();
			stat = conn.createStatement();
			n = stat.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			release(conn, stat, null);
		}
		return n;
	}

	public static void release(Connection conn, Statement stat, ResultSet rs) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (stat != null && !stat.isClosed()) {
				stat.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
}
