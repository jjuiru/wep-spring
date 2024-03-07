<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType = "text/html; charset=utf-8" %>
<%
    request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	boolean login = false;
	// mysql 접속 후 로그인 체크 
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String sql = "select count(*) as cnt from board where num = ? and writer = ?";
    try ( //자원반납을 자동으로 처리해주기 때문에 편리할 수 도 있고, 아닐 수 도 있다.ㅋㅋ
        Connection conn = DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/project1", "root", "mysql");
        PreparedStatement pstmt = conn.prepareStatement(sql);
    ) {    	
    	 pstmt.setString(1, id);
    	 pstmt.setString(2, password);
         ResultSet rs = pstmt.executeQuery();
      
    	 rs.next();
    	 int res = rs.getInt("cnt");
    	 // int res= rs.getInt(1); as로 이름을 주지 않았을 경우
    	 
    	 if (res==1){
    		 login = true;
    	 }   	 
    }catch(Exception e) {
        e.printStackTrace();
    }
    if (login) {
    	session.setAttribute("MEMBERID", id);
    	
//         response.sendRedirect("sessionLoginForm.jsp"); 
//    response.sendRedirect("loginCK.jsp");   // 로그인 메인 화면으로 돌아감 
      //  return; 
        %>	
<html>
<head><title>로그인성공</title></head>
<body>
 <script>
    alert('로그인 성공!');
//   history.back();
    //history.go(-1);
    
    location.href = "list.jsp";
</script>

 <%  //response.sendRedirect("../list.jsp"); html에 붙어서 나오기 때문에 script와 상관없이 이동 %>
</body>
</html>
<%
} else { // 로그인 실패시
%>
<script>
    alert('아이디 또는 비밀번호가 틀립니다!');
    history.back();
    //history.go(-1);
    
</script>
<%
	}
%>
<script>
    function logout() {
    window.location.href = "sessionLogout.jsp";
}
    </script>
