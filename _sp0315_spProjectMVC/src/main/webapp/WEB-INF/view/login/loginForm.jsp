
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en" data-bs-theme="auto">
<head>
<script src="assets/js/color-modes.js"></script>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.115.4">
<title>Signin Template · Bootstrap v5.3</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.3/examples/sign-in/">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
<link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/sign-in.css" rel="stylesheet">
</head>
<body>
<div style="margin-top: 200px;">
	<main class="form-signin w-100 m-auto">

		<form action="list" method="post">
			<h1 class="h3 mb-3 fw-normal">로그인</h1>
			<div class="form-floating">
				<input style="margin-bottom: 10px; border-radius: 10px;" type="text" class="form-control" id="id" name="id" placeholder="id"> 
				<label for="id">아이디</label>
			</div>

			<div class="form-floating">
				<input style=" border-radius: 10px;" type="text" class="form-control" id="pw" name="pw"
					placeholder="email">
				<label for="pw">패스워드</label>
			</div>

			<div class="form-check text-start my-3">
				<input class="form-check-input" type="checkbox"
					id="check" name="check" checked> <label class="form-check-label"
					for="check"> 아이디를 저장합니다. </label>
			</div>
			<div>
			<button style="margin-bottom: 10px; border-radius: 10px;" class="btn btn-sm btn-outline-secondary w-100 py-2" type="submit"
				>login</button>
				</div>
		</form>
			<div>
			<button style= "margin-bottom: 10px; border-radius: 10px;" class="btn btn-sm btn-outline-secondary w-100 py-2"
				onclick="location.href='join'">Sign in</button>
				</div>
				
			<div>
			<button style= "border-radius: 10px;" class="btn btn-sm btn-outline-secondary w-100 py-2"
				onclick="location.href='move'">main</button>
				</div>
			<p class="mt-5 mb-3 text-body-secondary">&copy; 2024–2027</p>
	</main>
</div>

	<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>