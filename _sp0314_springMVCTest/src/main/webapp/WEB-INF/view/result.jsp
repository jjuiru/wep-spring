<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 결과</h1>
${loginRequest.id} 님 환영합니다. <!-- 컨틀로러에서 생성한 객체를 받아 id를 뽑아 낼 수 있다. getId()를 표현언어가 고쳐주기 때문이다.  -->
${loginRequest.email}
${str}
${recordsNum}

<a href="move">메인으로 돌아가기</a> <!-- /를 사용하면 이동이 안되는 이유는 상대주소를 사용하기 때문이다. -->
<a href="${pageContext.request.contextPath}/">메인으로 돌아가기 2</a><!--  /의 경로로 직접간다. -->
<a href="list">list 보기</a>
</html>