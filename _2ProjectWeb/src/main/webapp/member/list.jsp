<%@page import="dao.MemberDao"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ page import="java.sql.*" %>

<%
String memberId = (String)session.getAttribute("userId");
 boolean login = memberId == null ? false : true;
 BoardDao dao = BoardDao.getInstance();
 List<Board> list = dao.selectList(); // selectList() 호출해보기
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>list</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<link rel="icon" href="favicon.ico" type="image/x-icon">
<script src="https://kit.fontawesome.com/c47106c6a7.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="../css/style.css">
<script defer src="js/ie.js"></script>
<style>
    /* 링크의 기본 스타일을 변경하여 링크 색상이 변하지 않도록 합니다. */
    a {
        color: inherit; /* 부모 요소의 색상을 상속받아 링크 색상을 설정합니다. */
        text-decoration: none; /* 밑줄을 제거합니다. */
    }
</style>
</head>
  <body>
	<header>
		<div class="inner">
			<!-- 메인화면을 나타내주는 가장 큰 메뉴 -->
			<h1>
				<a href="../mainPage.jsp">MOHAJIGALLERY</a>
			</h1>
			<ul id="gnb">
				<!-- gnb 메뉴바 >기능이 있는 작은 메뉴들 -->
				<li><a href="../mainpage/intro.jsp">INTRO</a></li>
				<li><a href="../mainpage/gallery.jsp">GALLERY</a></li>
				<li><a href="../mainpage/youtube.jsp">YOUTUBE</a></li>
				<li><a href="list.jsp">COMMUNITY</a></li>
				<li><a href="../mainpage/location.jsp">LOCATION</a></li>
			</ul>
			<ul class="util">
<%
    if ((String)session.getAttribute("userId") != null)
    	// Member member = (Member)session.getAttribute("member");
    	//if (member.getId() != null) 
    	{          
        // 로그인 상태일 때의 출력 
%>			
<li><a href="../minipage/mypage.jsp"><%=(String) session.getAttribute("userName")%>님 로그인</a></li>
				<li><a href="../login/help.jsp">Help</a></li>
				<li><a href="../login/logout.jsp">Logout</a></li>
				<li><a href="../minipage/mypage.jsp">Mypage</a></li>
			</ul>
<%  
    } else {                       
        // 로그인되지 않은 상태일 때의 출력           				
%>
                <li><a href="../login/help.jsp">Help</a></li>
				<li><a href="../login/login_main.jsp">Login</a></li>
				<li><a href="../login/join.jsp">join</a></li>
			</ul>		
		<!-- 메뉴의 상단영역 -->
		<%
    }
%>    </div>
	</header>
 <figure style="background-color: #FFFFFF; padding-top: 5px;">

<% if (login) {          // 로그인 상태일 때의 출력 %>
<div class="container" style="padding-top: 5px;">
 <br>
<div><h4 style="font-weight: 800;">Community</h4></div>
<table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">작성자</th>
      <th scope="col">작성일시</th>
      <th scope="col">조회수</th>
    </tr>
  </thead>
  <tbody class="table-group-divider">
     <%   for(Board board: list) {   %>  
    <tr>
      <th scope="row"><%=board.getNum()%></th>
      <td>                <a href="view.jsp?num=<%=board.getNum()%>">
                    <%=board.getTitle()%>
                </a></td>
      <td><%=board.getWriter()%></td>
      <td><%=board.getRegtime()%></td>
      <td><%=board.getHits()%></td>
    </tr>
            <% }%>
  </tbody>
</table>

 <button type="button" class="btn btn-dark" onclick="location.href='write.jsp'" >글쓰기</button>
</div>
<% } else{%>
<script>
alert('접근 권한이 없습니다. 로그인 해주세요!');
	 location.href = "../login/login_main.jsp";
	 </script>
<% }%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
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



