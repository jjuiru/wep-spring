<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Todo List</h1>
	<input id="todoInput" type="text" placeholder="할 일을 적으세요">
	<button id="addButton">Add</button>
	<ul id="todoList">
	</ul>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

	<script>
		//jquery로 만들기
		$(function() {//기능을 작성
			$.ajax({//ajax 라이브러리를 실행
				url : 'GetTodo', //서블릿 이름
				metod : 'GET', //get방식으로 가져온다.
				success : function(data) { //성공하면 받아와서 콘솔에 데이터를 찍는다.
					addItem(data); //콘솔창에 data를 잘 가져왔는지 확인할 수 있다.
				}
			});
		});
		//인풋버튼 변수선언후 이벤트 넣기
		const inputButton=$('#addButton');
		inputButton.click(function(){
			const value = $('#todoInput').val();
	        if(value){
	        addItem(value);
	        $('#todoInput').val("");//누름과 동시에 텍스트박스 클린
	      }
		});
		
		//todolist 안에 들어갈 내용 만들기
		function addItem(data) {			
			const list = $('#todoList');
			const item = $('<li></li>');
//			const item = $('<li></li>').text(data);
			const checkbox=$('<input type="checkbox">');
			const removeButton=$('<button></button>').text("삭제");
			//item.append(removeButton);
			
			checkbox.change(function(){
				if(checkbox.prop('checked')){
					item.css('text-decoration','line-through'); //체크상태이면 가로줄 생성
				}else{
					item.css('text-decoration','none');	
				}				
			});
					
			removeButton.click(function() {
				$.ajax({
					url : 'RemoveTodo',
					method : 'POST',
					data : {
						text : data //text라는 키값의 data라는 벨류의 형식으로 전송된다.
					},
					success : function() {//db 삭제가 성공하면 succes라는 함수가 콜백되고 해당 웹 화면에서도 삭제된다. 
						item.remove();
					}
				});
			});
			item.append(checkbox);
			item.append(data);
			item.append(removeButton);
			list.append(item);
			item.css('list-style-type', 'none'); // li태그의 css 없애기
		}
	</script>
</body>
</html>