<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>모하지갤러리</title>
<link rel="icon" href="favicon.ico" type="image/x-icon">
<script src="https://kit.fontawesome.com/c47106c6a7.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css">
<script defer src="js/ie.js"></script>
</head>
<body>
	<header>
		<div class="inner">
			<!-- 메인화면을 나타내주는 가장 큰 메뉴 -->
			<h1>
				<a href="mainPage.jsp">MOHAJIGALLERY</a>
			</h1>
			<ul id="gnb">
				<!-- gnb 메뉴바 >기능이 있는 작은 메뉴들 -->
				<li><a href="./mainpage/intro.jsp">INTRO</a></li>
				<li><a href="./mainpage/gallery.jsp">GALLERY</a></li>
				<li><a href="./mainpage/youtube.jsp">YOUTUBE</a></li>
				<li><a href="./member/list.jsp">COMMUNITY</a></li>
				<li><a href="./mainpage/location.jsp">LOCATION</a></li>
			</ul>
			<ul class="util">
<%
    if ((String)session.getAttribute("userId") != null)
    	// Member member = (Member)session.getAttribute("member");
    	//if (member.getId() != null) 
    	{          
        // 로그인 상태일 때의 출력 
%>			<li><a href="./login/mypage.jsp"><%=(String) session.getAttribute("userName")%>님 로그인</a></li>
				<li><a href="./login/help.jsp">Help</a></li>
				<li><a href="./login/logout.jsp">Logout</a></li>				
				<li><a href="./login/mypage.jsp">Mypage</a></li>
			</ul>
<%  
    } else {                       
        // 로그인되지 않은 상태일 때의 출력           				
%>
                <li><a href="./login/help.jsp">Help</a></li>
				<li><a href="./login/login_main.jsp">Login</a></li>
				<li><a href="./login/member_join_form.jsp">join</a></li>
			</ul>		
		<!-- 메뉴의 상단영역 -->
		<%
    }
%>    </div>
	</header>
	<figure>
		<video src="img/visual.mp4" autoplay muted loop></video>
		<div class="inner">
			<h1>MOHAJIGALLERY</h1>
			<p>
				Lorem ipsum dolor, sit amet consectetur adipisicing elit. <br>
				Tempora quidem doloribus quis aliquid, quaerat quibusdam aspernatur
				maxime quod blanditiis amet eaque consequatur similique in cum fuga
				ex illo expedita provident!
			</p>
			<a href="#">view intro</a>
		</div>
		<!-- 메인으로 보여질 공간  -->
	</figure>
	<section>
		<div class="inner">
			<h1>RECENT NEWS</h1>
			<div class="wrap">
				<article>
					<div class="pic">
						<img src="img/news1.jpg" alt="1번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
						<h2>
							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/news2.jpg" alt="2번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
						<h2>
							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/news3.jpg" alt="3번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
						<h2>
							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/news4.jpg" alt="4번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
						<h2>
							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>
				</article>
			</div>
		</div>
	</section>
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