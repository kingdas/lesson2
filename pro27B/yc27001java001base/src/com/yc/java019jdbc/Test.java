package com.yc.java019jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		// // 0.�����jar
		// // 1.ע������
		// Class.forName("com.mysql.jdbc.Driver");
		// // 2.��ȡ���Ӷ���
		// Connection conn = DriverManager.getConnection(
		// "jdbc:mysql://192.168.1.63:3306/abd", "root", "root");//
		// getConnection����ֵ�����ӡ�����
		// // 3.��ȡ�������
		// Statement stat = conn.createStatement();
		// // 4.ִ������
		// ResultSet rs = stat.executeQuery("select * from t_user");
		// // 5.������
		// while (rs.next()) {
		// System.out.println(rs.getInt("id") + "," + rs.getString("name"));
		// }
		// // 6.�ͷ���Դ
		// rs.close();
		// stat.close();
		// conn.close();
		// ////////////////////////////////////////////////
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn = DriverManager.getConnection(
		// "jdbc:mysql://192.168.1.63:3306/abd", "root", "root");//
		// getConnection����ֵ�����ӡ�����
		// Statement stat = conn.createStatement();
		// ResultSet rs = stat.executeQuery("select * from t_user");
		//
		// ResultSetMetaData rsmd= rs.getMetaData();
		// //System.out.println(rsmd.getColumnCount());
		// for(int i=1;i<=rsmd.getColumnCount();i++)
		// {
		// System.out.println(rsmd.getColumnName(i));
		//
		// }
		// rs.close();
		// stat.close();
		// conn.close();

		// //////////////////////////////////////////////
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.63:3306/abd", "root", "root");// getConnection����ֵ�����ӡ�����
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from t_user");

		ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println();
		while (rs.next()) {
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rs.getObject(rsmd.getColumnName(i)) + "\t");
			}
			System.out.println();
		}
		rs.close();
		stat.close();
		conn.close();

	}

}
