$(document).ready(function(){
    var sessionData = localStorage.getItem("sessionUser");
    console.log(JSON.parse(sessionData)); 
    $("#bannerUserName").text(sessionData.mid + "님 안녕하세요");
    
    setEventListener();
});

/************  버튼클릭이벤트 *************/
//트레이너 리스트
function trainerList(){
	$("#content").load("./trainerList.do");
}

//센터 리스트
function centerList(){
	$("#content").load("./centerList.do");
}

/************ 이벤트 리스너 **************/
function setEventListener(){
	$("#btnTrainerList").on("click", trainerList);
	$("#btnCenterList").on("click", centerList);
	
}
