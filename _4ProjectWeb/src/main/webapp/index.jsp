<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>vertical-layout</title>
<link rel="icon" href="favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="css/style.css" />
<script src="https://kit.fontawesome.com/c47106c6a7.js"></script>
​
<script src="js/isotope.pkgd.min.js"></script>
<script defer src="js/main.js"></script>

</head>
<body>

	<header>
		<h1>DECODE LAB</h1>
		<ul>
			<li><a href="https://www.instagram.com/mohaji_mo/"><i class="fab fa-twitter-square"></i> <span>Instargram</span></a></li>
			<li><a href="https://github.com/jjuiru"><i class="fab fa-facebook"></i> <span>GitHub</span></a></li>
			<li><a href="https://blog.naver.com/shj00035"><i class="fas fa-envelope"></i> <span>&nbsp;&nbsp;&nbsp;blog&nbsp;&nbsp;&nbsp;</span></a></li>
		</ul>
				<div class="header-background"></div>
		<div class="article-container">
			<article>
				<!-- Header에 표시될 이미지 -->
				<img src="img/f.png" alt="Header Image">
				<img src="img/f.png" alt="Header Image">
				<img src="img/f.png" alt="Header Image">
				<img src="img/f.png" alt="Header Image">
				<img src="img/f.png" alt="Header Image">
			</article>
		</div>
	</header>

	<main>
		<ul>
			<li class='on'><a href="*">ALL</a></li>
			<li><a href=".odd">ODD</a></li>
			<li><a href=".even">EVEN</a></li>
		</ul>

		<section>
			<article class='odd'>
				<div>
					<img src="img/p1.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p2.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p3.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p4.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p5.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p6.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p7.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p8.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p9.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p10.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p11.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p12.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p13.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p14.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p15.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p16.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p17.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p18.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='odd'>
				<div>
					<img src="img/p19.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
			<article class='even'>
				<div>
					<img src="img/p20.jpg" alt="">
					<h2>Here comes title.</h2>
					<p>Here comes content description in detail.</p>
				</div>
			</article>
		</section>
		<div id="modal" class="modal">
    <span class="close">&times;</span>
    <img src="" alt="Modal Image" id="modal-image">
</div>
<script>
document.addEventListener('DOMContentLoaded', function() {
    var articles = document.querySelectorAll('article');
    var modal = document.getElementById('modal');
    var modalImage = document.getElementById('modal-image');
    var closeBtn = document.querySelector('.close');

    articles.forEach(function(article) {
        article.addEventListener('click', function() {
            var imgSrc = this.querySelector('img').src;
            modalImage.src = imgSrc;
            modal.style.display = 'block';
        });
    });

    closeBtn.addEventListener('click', function() {
        modal.style.display = 'none';
    });

    window.addEventListener('click', function(event) {
        if (event.target == modal) {
            modal.style.display = 'none';
        }
    });
});
</script>
	</main>
</body>
</html>