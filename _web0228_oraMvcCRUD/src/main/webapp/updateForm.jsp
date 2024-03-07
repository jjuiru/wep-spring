<%@page import="mvjsp.board.model.Member"%>
<%@page import="mvjsp.board.dao.MemberDao"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String mno = request.getParameter("memberno");
Connection conn = ConnectionProvider.getConnection();
MemberDao dao = MemberDao.getInstance();
Member member= dao.select(conn, Integer.parseInt(mno));
request.setAttribute("member", member);
//하나하나 넘기는것보다 객체 자체를 넘기는게 좋다.
%>
<jsp:forward page="updateForm_view.jsp"/>


