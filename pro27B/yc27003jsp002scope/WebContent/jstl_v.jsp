<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入标签库 -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${us}" var="u">
${u.id },${u.name },${u.remark },${u.groupId }<br />
	</c:forEach>

	<br />
	<br /> ${u}
	<br />
	<br />
	<c:forEach begin="1" end="9" step="1" var="i">
		<c:set var="c" value="#00FF00" />
		<c:if test="${i%2==0 }">
			<c:set var="c" value="#FF0000" />
		</c:if>
		<hr size="${i}" color="${c}" />
	</c:forEach>
</body>
</html>