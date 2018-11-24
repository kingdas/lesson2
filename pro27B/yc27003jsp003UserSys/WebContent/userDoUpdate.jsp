<%@page import="com.yc.user.UserDao"%>
<%@page import="com.yc.user.UserDaoImpl"%>
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
		String ids = request.getParameter("id");//获取表单数据
		int id = 0;
		try {
			id = Integer.parseInt(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String name = request.getParameter("name");//获取表单数据
		String remark = request.getParameter("remark");
		String groupIdStr = request.getParameter("groupId");
		int groupId = Integer.parseInt(groupIdStr);//转成整型
		UserModel u = new UserModel(id, name, remark, groupId);
		UserDao userDao = new UserDaoImpl();
		userDao.update(u);
		response.sendRedirect("userList.jsp");//跳到指定页面 
		//out.print(u);
	%>
</body>
</html>