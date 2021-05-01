<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>

<!-- 홀수 짝수 판별 -->
<c:choose>
	<c:when test="${num % 2 == 0}">
		짝수
	</c:when>
	<c:otherwise>
		홀수
	</c:otherwise>
</c:choose>
<hr/>

<!-- 나이출력 -->
<div>
당신의 나이는 ${age}입니다.
</div>
<hr/>

<!-- 응용 구구단 반복문 -->
<c:forEach var="dan" begin="${n}" end="${m}">
	<c:if test="${dan % 2 == 1 }">
		<c:forEach var="i" begin="1" end="${limit}" step="1">
			<c:if test="${i % 2 == 0 }">
				<div>${dan} * ${i} = ${dan*i}</div>			
			</c:if>
		</c:forEach>		
		<br>
	</c:if>
</c:forEach>
<hr/>

<!-- 삼각형 만들기 -->
<c:forEach var="i" begin="1" end="${y}">
	<c:forEach var="j" begin="1" end="${i}">
		*
	</c:forEach>
	<br>				
</c:forEach>
<hr/>

<!-- 게시글 출력 -->
<c:forEach var="article" items="${articles}">
	<div>
		제목 : ${article.title} <br/>
		내용 : ${article.body}
	</div>
	<br/>		
</c:forEach>

</body>
</html>