<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
session.removeAttribute("userId");
session.removeAttribute("userName");
//response.sendRedirect("../mainPage.jsp"); // 로그인 메인 화면으로
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
window.onload = function() {
    alert('로그아웃 되었습니다.');
    
    location.href = "../mainPage.jsp";
};
</script>
</body>
</html>