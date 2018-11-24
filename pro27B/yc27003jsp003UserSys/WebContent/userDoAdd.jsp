<%@page import="com.yc.user.UserDaoImpl"%>
<%@page import="com.yc.user.UserDao"%>
<%@page import="com.yc.user.UserModel"%>
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
		String name = request.getParameter("name");//获取表单数据
		String remark = request.getParameter("remark");
		String groupIdStr = request.getParameter("groupId");
		int groupId = Integer.parseInt(groupIdStr);//转成整型
		UserModel u = new UserModel(name, remark, groupId);
		UserDao userDao = new UserDaoImpl();
		userDao.add(u);
		response.sendRedirect("userList.jsp");//跳到指定页面 
	%>
	
	<%-- <%=name%>,
	<%=remark%>,
	<%=groupId%>, --%>
</body>
</html>