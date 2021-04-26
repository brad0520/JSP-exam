<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String name = request.getParameter("name");
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<h1 style="color: blue;"><%=name%>의 홈페이지입니다.</h1>
</body>
</html>