$(document).ready(function(){
	trainerMenuEvent();
	
	
});


//트레이너글등록버튼
function clickTrainerWrite(){
	$("#content").load("./trainerWrite.do");
	
}


//버튼 이벤트
function trainerMenuEvent(){
	$("#trainerWrite").on("click", clickTrainerWrite);
}