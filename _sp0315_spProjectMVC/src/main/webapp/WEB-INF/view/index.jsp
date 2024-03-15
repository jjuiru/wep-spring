<%@page import="utill.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>모하지갤러리</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css">
<script defer src="js/ie.js"></script>
</head>
<body>
<div class="popup" id="popup" style="position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%); border: 1px solid #ccc; padding: 20px; background-color: rgba(255, 255, 255, 0.8); z-index: 1000; max-width: 80%; max-height: 90vh; overflow-y: auto;">
    	    <!-- 이미지 팝업 내용 -->
    	    <div style="max-width: 100%; max-height: 70%;">
    	        <img src="img/main.jpg" alt="main 콘텐츠 이미지" style="max-width: 100%; max-height: 100%; width: auto; height: auto;">
    	    </div>
    	    <div class="checkbox-btn" style="display: flex; justify-content: space-between; align-items: center; float: right;">
<!-- 	        <form action="cookieMake.jsp"> -->  
    	            <label><input type="checkbox" id="popcheck" name="popcheck">오늘은 더 이상 보지 않기</label>
    	            <button class="btn btn-sm btn-outline-secondary close-btn" style="margin-top: 10px; float: right;">닫기</button>
 <!--    	        </form> --> 
    	    </div>
    	</div> 
    	<script>
    // 닫기 버튼 요소를 찾습니다.
    var closeButton = document.querySelector('.close-btn');
    
    // 닫기 버튼에 클릭 이벤트 핸들러를 추가합니다.
    closeButton.addEventListener('click', function() {
        // 팝업 요소를 찾습니다.
        var popup = document.getElementById('popup');
        
        // 팝업을 숨깁니다.
        popup.style.display = 'none';
    });
</script>
<header>
<div class="inner">
			<!-- 메인화면을 나타내주는 가장 큰 메뉴 -->
			<h1>
				<a href="move">MOHAJIGALLERY</a>
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
			<li><a href="#">Help</a></li>
				<li><a href="loginForm">Login</a></li>
				<li><a href="#">join</a></li>
			</ul>
			</div>
</header>
<figure>
		<video src="img/main.mp4" autoplay muted loop></video>
		<div class="inner">
		<article class="art">
			<h1>MOHAJIGALLERY</h1>
			<pre>
			<p>
	"Welcome to the beautiful space 'MOHAJIGALLERY'. 
         This site provides information about various exhibitions. 
	 The community feature is available after signing up."
				
	 "아름다운 공간 'MOHAJIGALLERY' 에 오신것을 환영합니다.  
	  이 사이트는 여러가지 전시에 대한 정보를 제공하고 있습니다. 
	  community 기능은 회원가입 후 이용이 가능합니다."
			</p>
			</pre>
			<a href="./mainpage/intro.jsp">view intro</a>
			</article>
		</div>
		<!-- 메인으로 보여질 공간  -->
	</figure>
	<section>
		<div class="inner">
			<h1>RECENT NEWS</h1>
			<div class="wrap">
				<article>
					<div class="pic">
						<img src="img/KakaoTalk_20240304_015245193_17.jpg" alt="1번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="https://groundseesaw.co.kr/">groundseesaw</a>
						<h2>
							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/KakaoTalk_20240304_015245193_18.jpg" alt="2번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="https://groundseesaw.co.kr/">Lorem ipsum dolor sit.</a>
						<h2>
							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/KakaoTalk_20240304_015245193_20.jpg" alt="3번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="https://groundseesaw.co.kr/">Lorem ipsum dolor sit.</a>
						<h2>
							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>
				</article>
				<article>
					<div class="pic">
						<img src="img/KakaoTalk_20240304_015245193_26.jpg" alt="4번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="https://groundseesaw.co.kr/">Lorem ipsum dolor sit.</a>
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
</html>