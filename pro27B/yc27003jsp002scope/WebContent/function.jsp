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
		String m = request.getParameter("m");
		if ("add".equals(m)) {
			add(request, response);
		} else if ("del".equals(m)) {//m.equals("del"),m=null; m.equals
			del(request, response);
		} else {
			list(request, response);
		}
	%>

	<%!UserModel u = new UserModel();

	void add(HttpServletRequest request, HttpServletResponse response) {
		System.out.print("add");
	}

	void del(HttpServletRequest request, HttpServletResponse response) {
		System.out.print("del");
	}

	void list(HttpServletRequest request, HttpServletResponse response) {
		System.out.print("list");
	}%>
</body>
</html>