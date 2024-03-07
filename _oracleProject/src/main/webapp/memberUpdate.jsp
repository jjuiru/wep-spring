<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <% request.setCharacterEncoding("utf-8");
//post 방식일때 한글이 깨질까봐
//String driver="oracle.jdbc.driver.OracleDriver";
Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:xe";
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "update member set id=?, email=?, name=? where memberno=?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(4, request.getParameter("memberno"));
pstmt.setString(1, request.getParameter("id"));
pstmt.setString(2, request.getParameter("email"));
pstmt.setString(3, request.getParameter("name"));

int result = pstmt.executeUpdate();
%>
<% response.sendRedirect("list.jsp"); %>
    
