
$(document).ready(function(){
    var sessionData = JSON.parse(localStorage.getItem("sessionUser"));
    console.log(sessionData); 
    $("#bannerUserName").text(sessionData.mid + "님 안녕하세요");
    
    setEventListener();
});

/************  버튼클릭이벤트 *************/
//트레이너 리스트
function trainerList(){
	$("#content").load("./memberTrainerList.do");
}

//센터 리스트
function centerList(){
	$("#content").load("./memberCenterList.do");
}

//스크롤 마지막
function trainerScrollMax(){
	var scrollT = $(this).scrollTop();
	var scrollH = $(this).height();
	var contentH = $("#content").height();
	
	if(scrollT + scrollH + 1 >= contentH){
		console.log("scrollMax");
	}
}

/************ 이벤트 리스너 **************/
function setEventListener(){
	$("#content").on("scroll" ,trainerScrollMax);
	
}
