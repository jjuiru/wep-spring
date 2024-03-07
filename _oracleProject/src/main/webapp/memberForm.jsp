<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<form action="memberInput.jsp" method="post">
			<div class="mb-3">
				<label for="idInput" class="form-label">아이디</label> <input
					type="text" class="form-control" id="idInput" name="id"  placeholder="id">
			</div>
			<div class="mb-3">
				<label for="emailInput" class="form-label">이메일</label> <input
					type="email" class="form-control" id="emailInput" name="email"
					placeholder="name@example.com">
			</div>
			<div class="mb-3">
				<label for="nameInput" class="form-label">이름</label> <input
					type="text" class="form-control" id="nameInput" name="name" placeholder="name">
			</div>
			<button type="submit" class="btn btn-secondary">등록</button>
		</form>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
			crossorigin="anonymous"></script>
	</div>
</body>
</html>