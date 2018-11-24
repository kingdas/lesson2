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
		request.setAttribute("x", 5);
		UserModel um = new UserModel(1, "xx", "...", 1);
		request.setAttribute("u", um);
		//response.sendRedirect("b.jsp");//重定向：地址变
		request.getRequestDispatcher("b.jsp").forward(request, response);//转发
		//转发
	%>
	<%-- <jsp:forward page="b.jsp" /> --%>
	<!-- jsp的转向“动作” -->
	<%-- <hr />
	<%
		out.print(request.getAttribute("x"));
	%>
	<br />
	<%=request.getAttribute("u")%>
	<br />
	<%
		UserModel umt = (UserModel) request.getAttribute("u");
		out.print(umt.getName());
	%> --%>
</body>
</html>