<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="<c:url value="/resources/js/mainPage.js"/>"></script>
<script>
	
</script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
<div class="dimmed">
<div class="row" id="navigation" style="width:1545px;height:130px;background-color:#AAAAAA;">
	<div class="col-4" style="width:33%;background-color:#FFFFFF;">
	<div style="margin-top:90px;">
		<table style="width:100%;text-align:center;">
			<tbody>
				<tr>
					<td style="padding-left:"><input type="button" value="트레이너" onclick="trainerList()"/></td>
					<td><input type="button" value="헬스장" onclick="centerList()"/></td>
				</tr>
			</tbody>
		</table>
	</div>

	</div>
	<div class="col-4" style="width:34%;background-color:#11AABB;">
		<div style="margin-top:50px;margin-left:200px"><img src="" >로고 들어갈 곳</div>
		<div style="margin-top:15px"><input type="button" value="위치설정"/></div>
	</div>
	<div class="col-4" style="width:33%;background-color:#AABBCC;">
		<div style="margin-top:30px;">
			<table style="width:100%;text-align:center;">
				<tbody>
					<tr>
						<td></td>
						<td style="padding-left:250px">
							<table style="text-align:right;"> 
								<tbody>
									<tr>
										<td><input type="button" value="로그인" data-bs-toggle="modal" data-bs-target="#exampleModal"/></td>
										<td><input type="button" value="트레이너등록" /></td>
									</tr>
								</tbody>
							</table> 
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div style="margin-top:25px;">
			<table style="width:100%;text-align:center;">
				<tbody>
					<tr>
						<td style="padding-left:"><input type="button" value="운동방법" /></td>
						<td><input type="button" value="궁금해요" /></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
<div class="row" style="height:600px;width:1545px">
	<div id="content" style="overflow-y:auto;height:600px;"></div>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <table style="text-align:center;">
        	<colgroup>
        		<col style="width:50%">
        		<col>
        	</colgroup>
        	<tr>
        		<td>
        			<input type="radio" id="loginM"  name="userKind" value="member" checked="checked"/><label for="loginM">회원</label>
        			<input type="radio" id="loginT" name="userKind" value="trainer"/><label for="loginT">트레이너</label>
        			<input type="radio" id="loginO" name="userKind" value="owner"/><label for="loginO">관장</label>
        		</td>
        	</tr>
        	<tr>
        		<th><label>id:</label></th>
        		<td><input type="text" id="userId"/></td>
        	</tr>
        	<tr>
        		<th><label>pw:</label></th>
        		<td><input type="password" id="userPw"/></td>
        	</tr>
        </table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" onclick="modalLogin()">로그인</button>
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" id="btnLoginClose">Close</button>
      </div>
    </div>
  </div>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js" integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js" integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous"></script>
</body>
</html>