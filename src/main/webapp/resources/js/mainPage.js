var stateMain = {
	md:{
		currentPage:1,
		isEnd: false
	}
}

$(document).ready(function(){
    
    setEventListener();
});


function trainerList(){
	$("#content").load("./trainerList.do");
}
function centerList(){
	$("#content").load("./centerList.do");
}
function memberPage(){
	
}
function modalLogin(){
	var id = $("#userId").val();
	var pw = $("#userPw").val();
	var userKind = $('[name="userKind"]').val();
	var urls = "";
	console.log(urls);
	$.ajax({
		url : "./ajaxLogin.do",
		type : 'POST',
		data : {userId : id, userPw : pw, userKind: userKind},
		success : function(data){
			console.log(data);
			if(data.isLogin == "S"){
				console.log(data.sessionUser);
				localStorage.setItem("sessionUser", JSON.stringify(data.sessionUser));
				window.location.href="/healthper/memberLogin.do" 
				$("#btnLoginClose").click();
			}else{
				alert("아이디와 비밀번호를 확인해주세요");
			}
		}
	});
}
function loginPopupClose(){
	$(".dimmed").css("z-index","0");
}
/************* 일반메소드 ***************/
function findTrainerList(local, offset){
	var local = local != null ? local : '';
	var offset = offset != null ? offset : '1';
	$.ajax({
		url:'',
		type:'POST',
		data:{mPlace:local, currentPage:offset},
		success:function(data){
			data.forEach(function(item){
				var html;
			});
		}
	});
}

/************  버튼클릭이벤트 *************/
//스크롤 마지막
function trainerScrollMax(){
	var scrollT = $(this).scrollTop();
	var scrollH = $(this).height();
	var contentH = $("#lists").height();
	if(!stateMain.md.isEnd && scrollT + scrollH + 1 >= contentH){
		console.log("scrollMax");
		stateMain.md.isEnd=true;
		//추가로 가져오기.....
	}
}

/************ 이벤트 리스너 **************/
function setEventListener(){
	$("#content").on("scroll" ,trainerScrollMax);
	
}



