<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
테스트 입니당
	
	<form action="./testLogin.do">
		<table>
			<tbody>
				<tr>
					<th>id : </th>
					<td>
						<input type="text" id="testId" name="testId">
					</td>
				</tr>
				<tr>
					<th>pw : </th>
					<td>
						<input type="text" id="testPw" name="testPw">
					</td>
				</tr>
				<tr>
					<th></th>
					<td>
						<input type="submit" value="로그인테스트">
					</td>
				</tr>
			</tbody>
		</table>
	</form>

</body>
</html>