<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${ pageContext.request.contextPath }/board">게시판</a>
	<a href="${ pageContext.request.contextPath }/board/write">새글등록</a>
	<c:if test="${ empty loginUser }">
		<a href="${ pageContext.request.contextPath }/login">로그인</a>
	</c:if>
	<c:if test="${not empty loginUser }">
		<a href="${ pageContext.request.contextPath }/logout">로그아웃</a>
	</c:if>
</body>
</html>