<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>게시글 상세</h2>
    <div class="row" style="background-color: #f0f0f0;">
        <div class="col-md-3 py-2  font-weight-bold">작성자명</div>
        <div class="col-md-9 py-2">${board.writer}</div>
    </div>
    <div class="row" style="background-color: #f9f9f9;">
        <div class="col-md-3 py-2  font-weight-bold">조회수</div>
        <div class="col-md-9 py-2">${board.viewCnt}</div>
    </div>
    <div class="row" style="background-color: #f0f0f0;">
        <div class="col-md-3 py-2  font-weight-bold">등록일</div>
        <div class="col-md-9 py-2">${board.regDate}</div>
    </div>
    <div class="row" style="background-color: #f9f9f9;">
        <div class="col-md-3 py-2  font-weight-bold">내용</div>
        <div class="col-md-9 py-2">${board.content}</div>
    </div>
    <button onclick="location.href='${pageContext.request.contextPath}/board'">목록</button>
</div> 
</body>
</html>