<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>모하지갤러리</title>
<link rel="icon" href="favicon.ico" type="image/x-icon">
<script src="https://kit.fontawesome.com/c47106c6a7.js"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<script defer src="js/ie.js"></script>
</head>
<body>
	<header>
		<div class="inner">
			<!-- 메인화면을 나타내주는 가장 큰 메뉴 -->
			<h1>
				<a href="">MOHAJIGALLERY</a>
			</h1>
			<ul id="gnb">
				<!-- gnb 메뉴바 >기능이 있는 작은 메뉴들 -->
				<li><a href="#">INTRO</a></li>
				<li><a href="#">GALLERY</a></li>
				<li><a href="#">YOUTUBE</a></li>
				<li><a href="#">COMMUNITY</a></li>
				<li><a href="#">LOCATION</a></li>
			</ul>
			<ul class="util">
				<li><a href="#">#님
						로그인</a></li>
				<li><a href="#">Help</a></li>
				<li><a href="#">Logout</a></li>
				<li><a href="#">admin page</a></li>


				<li><a href="mypage.jsp">Mypage</a></li>

			</ul>
	</header>
	<figure style="background-color: #fff; padding-top: 5px;">
		<div class="container" style="padding-top: 5px">
			<h1>account</h1>
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th scope="col">id</th>
						<th scope="col">이름</th>
						<th scope="col">나이</th>
						<th scope="col">이메일</th>
						<th scope="col">시간</th>
						<th scope="col">메모</th>
					</tr>
				</thead>

				<tbody class="table-group-divider">
					<c:forEach var="mal" items="${memberAllList}">
						<tr onclick="submitForm('${mal.id}%');"
							style="cursor: pointer;">
							<th scope="row">${mal.id}</th>
							<td>${mal.name}</td>
							<td>${mal.age}</td>
							<td>${mal.email}</td>
							<td>${mal.regdate}</td>
							<td>${mal.meno}</td>
					</c:forEach>
					</tr>
				</tbody>
				<form id="memberForm" action="memberview.jsp" method="post">
					<input type="hidden" name="memberno" id="memberNoInput">
				</form>

				<script>
					function submitForm(memberno) {
						document.getElementById('memberNoInput').value = memberno;
						document.getElementById('memberForm').submit();
					}
				</script>

			</table>
			<button type="button" class="btn btn-sm btn-outline-secondary"
				onclick="location.href='memberForm.jsp';">회원입력</button>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
			crossorigin="anonymous"></script>
	</figure>
	</figure>
	<footer>
		<div class="inner">
			<div class="upper">
				<h1>DCODELAB</h1>
				<ul>
					<li><a href="#">Plicy</a></li>
					<li><a href="#">Terms</a></li>
					<li><a href="#">Family Site</a></li>
					<li><a href="#">Sitemap</a></li>
				</ul>
			</div>

			<div class="lower">
				<address>
					Lorem ipsum dolor sit amet consectetur adipisicing elit. Molestias,
					voluptatem? <br> TEL: 010-7760-3956
				</address>
				<p>2020 DCODELAB uuuuummmmm</p>
			</div>
		</div>
		<!-- 기업정보 -->
	</footer>
</body>
</html>