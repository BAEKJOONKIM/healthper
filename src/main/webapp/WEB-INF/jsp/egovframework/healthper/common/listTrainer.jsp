<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	$(".tCard").click(function(){
		$('#content').empty();
		$("#content").load("/test/trainerDetail.do");
	});
</script>
<script src='<c:url value="/resources/js/listTrainer.js"/>'></script>
</head>
<body>
<div class="row" id="trainerContent" style="margin-left:50px">
<div class="row">
	<table style="width:280px">
		<tbody>
			<tr>
				<th>이문동</th>
				<td>에서 활동하는 동네형입니다.</td>
			</tr>
		</tbody>
	</table>
</div>
<div class="row" style="height:20px"></div>
<div class="row">
<div class="col-9" id="lists">
<div class="row" id="">
<div id="commonList"></div>
	<div class="col-4" style="margin-top:20px;margin-bottom:20px">
	<div class="card tCard" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">An item</li>
    <li class="list-group-item">A second item</li>
    <li class="list-group-item">A third item</li>
  </ul>
  <div class="card-body">
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
	</div>
	</div>
	<div class="col-4" style="margin-top:20px;margin-bottom:20px">
	<div class="card tCard" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">An item</li>
    <li class="list-group-item">A second item</li>
    <li class="list-group-item">A third item</li>
  </ul>
  <div class="card-body">
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
	</div>
	</div>
	<div class="col-4" style="margin-top:20px;margin-bottom:20px">
	<div class="card tCard" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">An item</li>
    <li class="list-group-item">A second item</li>
    <li class="list-group-item">A third item</li>
  </ul>
  <div class="card-body">
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
	</div>
	</div>
	<div class="col-4" style="margin-top:20px;margin-bottom:20px">
	<div class="card tCart" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">An item</li>
    <li class="list-group-item">A second item</li>
    <li class="list-group-item">A third item</li>
  </ul>
  <div class="card-body">
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
	</div>
	</div>
	<div class="col-4" style="margin-top:20px;margin-bottom:20px">
	<div class="card tCard" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">An item</li>
    <li class="list-group-item">A second item</li>
    <li class="list-group-item">A third item</li>
  </ul>
  <div class="card-body">
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
	</div>
	</div>
</div>
</div>
<div class="col-3">
<div class="row" style="position:sticky;top:10px;"><input type="button" value="검색" style="width:100px"/></div>
<div class="row" style="position:sticky;margin-top:10px;top:70px;width:300px;height:400px;background-color:#FAAABC;">sdlkfjlsdkjf</div>
</div>
</div>
</div>
</body>
</html>