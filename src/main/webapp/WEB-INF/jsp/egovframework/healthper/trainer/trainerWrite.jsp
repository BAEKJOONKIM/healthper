<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src='<c:url value="/resources/js/trainer/trainerWrite.js"/>'></script>
</head>
<body>
<div class="row" id="trainerWrite">
<div class="row">
	<div class="col-2"></div>
	<div class="col-7">

		<table>
			<colgroup>
				<col>
				<col>
				<col>
				<col>
			</colgroup>
			<tbody>
				<tr>
					<th><span>글 제목: </span></th>
					<td><input type="text" id="boardTitle"/></td>
					<th><span>글쓴이:</span></th>
					<td><input type="text" id="writerName" readonly/></td>
				</tr>
				<tr>
					<th><span>글 내용: </span></th>
					<td><textarea id="boardContent" rows="10"></textarea></td>
				</tr>
				<tr>
					<th><span>첨부사진: </span></th>
					<td>
						<input type="file" id="file" style="display:none"/>
						<input type="text" id="fileName"/>
						<label for="file" class="btn btn-primary">사진등록</label>
					</td>
				</tr>
				<tr>
					<th><span>지역</span></th>
					<td>
						<select id="writerArea">
							<option value="999999">테스트</option>
						</select>
					</td>
					<th><span>센터</span></th>
					<td>
						<select id="writerCenter">
							<option value="99999999">테스트</option>
						</select>
					</td>
				</tr>
				<tr>
					<th></th>
					<td>
						<button type="button" id="btnSave">등록</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="col-3"></div>
</div>
</div>
</body>
</html>