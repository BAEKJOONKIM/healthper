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
				console.log('로그인성공');
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