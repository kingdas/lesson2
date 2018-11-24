<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.yc.UserModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		UserModel u = new UserModel(1, "a", ".", 1);
		request.setAttribute("u", u);//在requestScope范围设置属性
		List<UserModel> us = new ArrayList<UserModel>();
		us.add(u);
		u = new UserModel(2, "b", "..", 2);
		us.add(u);
		u = new UserModel(3, "c", "...", 1);
		us.add(u);
		request.setAttribute("us", us);
		request.getRequestDispatcher("jstl_v.jsp").forward(request,
				response);
	%>
</body>
</html>