<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	let checkLogin = function() {
		let f = document.loginForm
		let id = f.id.value
		let pw = f.password.value

		if (id == '') {
			alert('아이디를 입력하세요')
			f.id.focus()
			return false
		}

		if (pw == '') {
			alert('비밀번호를 입력하세요')
			f.password.focus()
			return false
		}

		return true

	}
</script>

</head>
<body>
	<div align="center">
		<h2>로그인 페이지</h2>
		<hr>
		<form method="post" name="loginForm" onsubmit="return checkLogin()">
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password" /></td>
				</tr>
			</table>
			<button type="submit">로그인</button>
		</form>
	</div>
</body>
</html>