<%@page import="com.yc.user.UserDaoImpl"%>
<%@page import="com.yc.user.UserDao"%>
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
		request.setCharacterEncoding("utf-8");//设置编码
		//内置对象
		String ids = request.getParameter("id");//获取表单数据
		int id = Integer.parseInt(ids);
		UserDao userDao = new UserDaoImpl();
		userDao.del(id);
		response.sendRedirect("userList.jsp");//跳到指定页面 
		//out.print(id);//页面输出
		//System.out.print(id);
	%>
</body>
</html>