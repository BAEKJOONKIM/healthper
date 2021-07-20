
//시작
$(document).ready(function(){
	getTrainerBoards();
	
});

//조회정보
function getSpec(){
	return {
		area: '',
	};
}

//트레이너글 조회동작
function getTrainerBoards(){
	var spec = getSpec();
	
	var area = spec.area;
	var offset = '1';
	
	findTrainerBoard(area, offset);
}

//트레이너글 조회function
function findTrainerBoard(area, offset){
	var area = $.ifnull(area, '');
	var offset = $.ifnull(offset, '1');
	var data = {
		area: area,
		page: offset
	}
	
	$.ajax({
		url: "",
		type: "POST",
		data: data,
		success: function(data){
			data.list.forEach(function(item){
				showBoard(item);
			});
		}
	});
}

//스크롤 내리면 글추가
function scrollMax(){
	var scrollT = $(this).scrollTop();
	var scrollH = $(this).height();
	var contentH = $("#commonList").height();
	if(scrollT + scrollH + 1 >= contentH){
		findTrainerBoard()
	}
}

//이벤트리스너
function listTrainerEvent(){
	$("#commonList").on("scrollMax", scrollMax);
}

//트레이너글 화면에 추가
function showBoard(data){
	var html = '<div class="col-4" style="margin-top:20px;margin-bottom:20px">'
			 + '<div class="card tCard" style="width: 18rem;">'
			 + '<img src="..." class="card-img-top" alt="...">'
			 + '<div class="card-body">'
			 + '<h5 class="card-title">'+data.boardTitle+'</h5>'
			 + '<p class="card-text">'+data.boardSum+'</p></div>'
			 + '<ul class="list-group list-group-flush">'
			 + '<li class="list-group-item">An item</li>'
			 + '<li class="list-group-item">A second item</li>'
			 + '<li class="list-group-item">A third item</li>'
			 + '</ul>'
			 + '<div class="card-body">'
			 + '<a href="#" class="card-link">Card link</a>'
			 + '<a href="#" class="card-link">Another link</a>'
			 + '</div>'
			 + '</div>'
			 + '</div>';
	$("#commonList").append(html); 
}

//null 검사
$.ifnull = function(asIs, toBe){
	if(asIs === null || typeof asIs === "undefined"){
		return toBe;
	}else{
		return asIs;
	}
}