
$(document).ready(function(){
	trainerWriteInit();
	
	trainerWriteEventHandler();
});

function trainerWriteInit(){
	
}

function trainerWriteAction(){
	var data = getData();
	
	var midx = data.mIdx;
	var title = data.title;
	var name = data.name;
	var content = data.content;
	var filename = data.filename;
	var area = data.area;
	var center = data.center;
	
	trainerBoardSave(midx, title, name, content, filename, area, center);
}

function trainerWriteEventHandler(){
	$("#btnSave").on("click", trainerWriteAction);
}

function getData(){
	return {
		mIdx: sessionData.midx,
		title: $("#boardTitle").val(),
		name: $("#writerName").val(),
		content: $("#boardContent").val(),
		filename: $("#filename").val(),
		area: $("#writerArea").val(),
		center: $("#writerCenter").val(),
	};
}

/************************/

function trainerBoardSave(midx, title, name, content, filename, area, center){
	var data = {
		mIdx: midx,
		boardTitle: title,
		writerName: name,
		boardContent: content,
		fileName: filename,
		writerArea: area,
		writerCenter: center, 
	}; 
	console.log(data);
	$.ajax({
		 url:"./trainerWriteAction.do",
		 type:"POST",
		 data: data,
		 success: function(data){
			 console.log(data);
			 if(data.result == "S"){
				 alert('성공');
				 $("#content").load("./trainerMenu.do");
			 }else{
				 alert("실패");
			 }
		 }
	});
	
}
