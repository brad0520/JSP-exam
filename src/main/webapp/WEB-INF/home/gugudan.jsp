<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.sbs.example.util.Util"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<%
int dan = (int)request.getAttribute("dan");
int limit = (int)request.getAttribute("limit");
%>

<h1>
=== 구구단 <%=dan%> 단 ===
</h1>
<%for (int i=1; i<=limit; i++) {%>
<div>
<%=dan%> * <%=i%> = <%=dan*i%>
</div>
<%}%>
</body>
</html>