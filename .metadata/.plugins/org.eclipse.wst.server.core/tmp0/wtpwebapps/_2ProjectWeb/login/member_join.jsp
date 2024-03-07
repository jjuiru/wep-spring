<%@page import="dao.MemberTest"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%

    request.setCharacterEncoding("utf-8"); // post방식이라
    String id = request.getParameter("id"); // 아이디 전송하게 하기
    Member member =MemberTest.getInstance().select(id);
    
        if (member !=null ) {   
            // 이미 있는 아이디이면 오류 표시
%>
            <script>
                alert('이미 등록된 아이디입니다.');
                history.back()
            </script>
<%
          
        } else {       
        	Member member1 = new Member(request.getParameter("id"),
        			request.getParameter("email"),
        			request.getParameter("name"));
            MemberTest.getInstance().insert(member1);
        // 새로운 회원정보를 DB에 추가하는 쿼리
%>
            <script>
                alert('가입이 완료되었습니다.');
           	    location.href = "../login/login_main.jsp";
                window.close();
                
            </script>
<%          
        }
%>

</body>
</html>