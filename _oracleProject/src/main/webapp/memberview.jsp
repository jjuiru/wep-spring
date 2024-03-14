<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
String sql = "select *  from member where memberno= ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("memberno"));
ResultSet rs = pstmt.executeQuery();
%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<div class="container" style="padding-top: 50px">
		<%
		if (rs.next()) {
			//필드 개수만큼 나온다
			int memberno = rs.getInt("memberno");
			String id = rs.getString("id");
			String email = rs.getString("email");
			String name = rs.getString("name");
		%>
		<form id="myForm" method="post">
			<div class="mb-3">
				<label for="membernoview" class="form-label">아이디</label> <input
					type="text" class="form-control" id="membernoview" name="memberno"
					value="<%=memberno%>">
			</div>

			<div class="mb-3">
				<label for="idview" class="form-label">아이디</label> <input
					type="text" class="form-control" id="idview" name="id"
					value="<%=id%>">
			</div>
			<div class="mb-3">
				<label for="emailview" class="form-label">이메일</label> <input
					type="email" class="form-control" id="emailview" name="email"
					value="<%=email%>">
			</div>
			<div class="mb-3">
				<label for="nameview" class="form-label">이름</label> <input
					type="text" class="form-control" id="nameview" name="name"
					value="<%=name%>">
			</div>
			<button type="submit" class="btn btn-secondary"
				onclick="setAction('memberUpdate.jsp')">수정</button>
			<button type="submit" class="btn btn-secondary"
				onclick="setAction('memberDelete.jsp')">삭제</button>
		</form>
		<%
		}
		%>
		<script>
			function setAction(action) {
				document.getElementById("myForm").action = action;
			}
		</script>

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
			crossorigin="anonymous">
			
		</script>
	</div>
</body>
</html>