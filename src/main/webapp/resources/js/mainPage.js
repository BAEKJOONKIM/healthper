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
					
				}
			}
		});
	}
	function loginPopupClose(){
		$(".dimmed").css("z-index","0");
	}