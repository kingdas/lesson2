<%@page import="com.yc.user.UserModel"%>
<%@page import="java.util.List"%>
<%@page import="com.yc.user.UserDaoImpl"%>
<%@page import="com.yc.user.UserDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		<a href="userAdd.jsp">增加用户</a>
	</p>
	<table width="640" border="1">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>备注</th>
			<th>组号</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		<%-- <%
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/abd", "root", "root");
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from t_user");
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("id")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("remark")%></td>
			<td><%=rs.getInt("groupid")%></td>
		</tr>
		<%
			}
			rs.close();
			stat.close();
			conn.close();
		%> --%>
		<%
			UserDao userDao = new UserDaoImpl();
			List<UserModel> us = userDao.findAll();
			for (UserModel u : us) {
		%>
		<tr>
			<td><%=u.getId()%></td>
			<td><%=u.getName()%></td>
			<td><%=u.getRemark()%></td>
			<td><%=u.getGroupId()%></td>
			<td><a href="userUpdate.jsp?id=<%=u.getId()%>">修改</a></td>
			<td><a href="userDel.jsp?id=<%=u.getId()%>">删除</a></td>
			<!-- 页面传值 -->
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>