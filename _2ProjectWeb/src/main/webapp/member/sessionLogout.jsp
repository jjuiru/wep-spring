<%@ page contentType = "text/html; charset=utf-8" %>
<%
	session.invalidate();
%>
<html>
<head><title>로그아웃</title></head>
<body>

로그아웃하였습니다.

<button onClick="loginForm()">메인으로</button>
</body>
</html>
<script type="text/javascript">
function loginForm() {
	window.location.href = "sessionLoginForm.jsp";
}
</script>