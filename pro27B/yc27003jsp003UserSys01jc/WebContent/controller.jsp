<%@page import="com.yc.user.UserModel"%>
<%@page import="java.util.List"%>
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
		request.setCharacterEncoding("utf-8");
		String m = request.getParameter("m");
		if ("add".equals(m)) {
			add(request, response);
		} else if ("del".equals(m)) {
			del(request, response);
		} else if ("update".equals(m)) {
			update(request, response);
		} else if ("doUpdate".equals(m)) {
			doUpdate(request, response);
		} else {
			list(request, response);
		}
	%>

	<%!UserDao userDao = new UserDaoImpl();

	void update(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		UserModel u = userDao.findById(id);
		request.setAttribute("u", u);
		try {
			request.getRequestDispatcher("userUpdate.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void doUpdate(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");
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
		userDao.update(u);
		list(request, response);
	}

	void del(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");//获取表单数据
		int id = Integer.parseInt(ids);
		userDao.del(id);
		list(request, response);
	}

	void add(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");//获取表单数据
		String remark = request.getParameter("remark");
		String groupIdStr = request.getParameter("groupId");
		int groupId = Integer.parseInt(groupIdStr);//转成整型
		UserModel u = new UserModel(name, remark, groupId);
		userDao.add(u);
		list(request, response);
	}

	void list(HttpServletRequest req, HttpServletResponse resp) {
		List<UserModel> us = userDao.findAll();
		req.setAttribute("us", us);
		try {
			req.getRequestDispatcher("userList.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>
</body>
</html>