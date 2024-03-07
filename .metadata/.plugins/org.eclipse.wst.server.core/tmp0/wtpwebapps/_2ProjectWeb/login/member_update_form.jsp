<%@page import="dao.MemberTest"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 정보 수정</title>
</head>
<body>

<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id"); // 아이디 전송하게 하기
Member member =MemberTest.getInstance().select((String)session.getAttribute("userId"));
%>
        <form action="member_update.jsp" method="post">
            <table>
                <tr>
                    <td>아이디</td>
                    <td><input type="text" name="id" readonly
                               value="<%=member.getId()%>"></td>
                </tr>
                <tr>
                    <td>이메일</td>
                    <td><input type="text" name="pw" 
                               value="<%=member.getEmail()%>"></td>
                </tr>
                <tr>
                    <td>이름</td>
                    <td><input type="text" name="name" 
                               value="<%=member.getName()%>"></td>
                </tr>
            </table>    
            <input type="submit" value="저장"> 
        </form>

</body>
</html>