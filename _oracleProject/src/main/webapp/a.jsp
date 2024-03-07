<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="b.jsp">b 페이지 이동</a>
<a href="https://www.naver.com">네이버</a>
<!-- get방식 post로 보내려면 스크립트를 사용해야한다. -->
<%=request.getParameter("name")%>
<!-- 변수를 설정 하고 싶으면 위에서 먼저 선언후 변수에 저장하고 프린트한다.+ post 방식으로 받을 경우는 인코딩 필수 -->

</body>
</html>