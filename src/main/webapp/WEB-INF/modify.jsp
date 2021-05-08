<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 게시물 수정 페이지</h1>
	<form action="TestServlet" method="POST">
		<div>
			제목 : 
			<input type="text" name="title" value="${article.title}"/>  
		</div>
		<div>
			<textarea name="body" name="body" cols="30" rows="10">${article.body}</textarea> 
		</div>
		<input type="submit" value="수정"/>
		<input type="hidden" name="action" value="doModify"/>
		<input type="hidden" name="id" value="${article.id}"/>
	</form>
	<a href="#">삭제</a>
</body>
</html>