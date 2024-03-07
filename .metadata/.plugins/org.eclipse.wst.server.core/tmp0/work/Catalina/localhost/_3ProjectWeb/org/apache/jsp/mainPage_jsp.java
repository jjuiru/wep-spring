/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-03-06 23:50:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uill.Cookies;

public final class mainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("uill.Cookies");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>모하지갤러리</title>\r\n");
      out.write("<link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/c47106c6a7.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<script defer src=\"js/ie.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

    String no= request.getParameter("no");
    System.out.print(no);
    
    String check= null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("popcheck")) {
                check = cookie.getValue();
                // 이제 popcheckValue에 쿠키 값이 들어 있습니다.
            }
        }
    }
//    String check = request.getParameter("popcheck");
    if (check != null && check.equals("on")) {

    } else {
    
    	if (no != null && no.equals("no")) {
    	    
    } else{
    	
      out.write("\r\n");
      out.write("    	<div class=\"popup\" id=\"popup\" style=\"position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%); border: 1px solid #ccc; padding: 20px; background-color: rgba(255, 255, 255, 0.8); z-index: 1000; max-width: 80%; max-height: 90vh; overflow-y: auto;\">\r\n");
      out.write("    	    <!-- 이미지 팝업 내용 -->\r\n");
      out.write("    	    <div style=\"max-width: 100%; max-height: 70%;\">\r\n");
      out.write("    	        <img src=\"img/main.jpg\" alt=\"main 콘텐츠 이미지\" style=\"max-width: 100%; max-height: 100%; width: auto; height: auto;\">\r\n");
      out.write("    	    </div>\r\n");
      out.write("    	    <div class=\"checkbox-btn\" style=\"display: flex; justify-content: space-between; align-items: center; float: right;\">\r\n");
      out.write("    	        <form action=\"cookieMake.jsp\">\r\n");
      out.write("    	            <label><input type=\"checkbox\" id=\"popcheck\" name=\"popcheck\">오늘은 더 이상 보지 않기</label>\r\n");
      out.write("    	            <button class=\"btn btn-sm btn-outline-secondary close-btn\" onclick=\"cookieMake.jsp\" style=\"margin-top: 10px; float: right;\">닫기</button>\r\n");
      out.write("    	        </form>\r\n");
      out.write("    	    </div>\r\n");
      out.write("    	</div> 	\r\n");
      out.write("   ");
    }   	
    } 
    
      out.write("\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<!-- 메인화면을 나타내주는 가장 큰 메뉴 -->\r\n");
      out.write("			<h1>\r\n");
      out.write("				<a href=\"mainPage.jsp\">MOHAJIGALLERY</a>\r\n");
      out.write("			</h1>\r\n");
      out.write("			<ul id=\"gnb\">\r\n");
      out.write("				<!-- gnb 메뉴바 >기능이 있는 작은 메뉴들 -->\r\n");
      out.write("				<li><a href=\"./mainpage/intro.jsp\">INTRO</a></li>\r\n");
      out.write("				<li><a href=\"./mainpage/gallery.jsp\">GALLERY</a></li>\r\n");
      out.write("				<li><a href=\"./mainpage/youtube.jsp\">YOUTUBE</a></li>\r\n");
      out.write("				<li><a href=\"./member/list.jsp\">COMMUNITY</a></li>\r\n");
      out.write("				<li><a href=\"./mainpage/location.jsp\">LOCATION</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"util\">\r\n");

    if ((String)session.getAttribute("userId") != null)
    	// Member member = (Member)session.getAttribute("member");
    	//if (member.getId() != null) 
    	{          
        // 로그인 상태일 때의 출력 

      out.write("			<li><a href=\"./login/mypage.jsp\">");
      out.print((String) session.getAttribute("userName"));
      out.write("님 로그인</a></li>\r\n");
      out.write("				<li><a href=\"./login/help.jsp\">Help</a></li>\r\n");
      out.write("				<li><a href=\"./login/logout.jsp\">Logout</a></li>	\r\n");
      out.write("							");
if("admin".equals((String)session.getAttribute("userId"))){ 
      out.write("\r\n");
      out.write("					<li><a href=\"./login/member_list.jsp\">admin page</a></li>		\r\n");
      out.write("				\r\n");
      out.write("				");
 } else{
      out.write("			\r\n");
      out.write("				<li><a href=\"./login/mypage.jsp\">Mypage</a></li>\r\n");
      out.write("				");
}
      out.write("\r\n");
      out.write("			</ul>\r\n");
  
    } else {                       
        // 로그인되지 않은 상태일 때의 출력           				

      out.write("\r\n");
      out.write("                <li><a href=\"./login/help.jsp\">Help</a></li>\r\n");
      out.write("				<li><a href=\"./login/login_main.jsp\">Login</a></li>\r\n");
      out.write("				<li><a href=\"./login/member_join_form.jsp\">join</a></li>\r\n");
      out.write("			</ul>		\r\n");
      out.write("		<!-- 메뉴의 상단영역 -->\r\n");
      out.write("		");

    }

      out.write("    </div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<figure>\r\n");
      out.write("		<video src=\"img/main.mp4\" autoplay muted loop></video>\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("		<article class=\"art\">\r\n");
      out.write("			<h1>MOHAJIGALLERY</h1>\r\n");
      out.write("			<pre>\r\n");
      out.write("			<p>\r\n");
      out.write("	\"Welcome to the beautiful space 'MOHAJIGALLERY'. \r\n");
      out.write("         This site provides information about various exhibitions. \r\n");
      out.write("	 The community feature is available after signing up.\"\r\n");
      out.write("				\r\n");
      out.write("	 \"아름다운 공간 'MOHAJIGALLERY' 에 오신것을 환영합니다.  \r\n");
      out.write("	  이 사이트는 여러가지 전시에 대한 정보를 제공하고 있습니다. \r\n");
      out.write("	  community 기능은 회원가입 후 이용이 가능합니다.\"\r\n");
      out.write("			</p>\r\n");
      out.write("			</pre>\r\n");
      out.write("			<a href=\"./mainpage/intro.jsp\">view intro</a>\r\n");
      out.write("			</article>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- 메인으로 보여질 공간  -->\r\n");
      out.write("	</figure>\r\n");
      out.write("	<section>\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<h1>RECENT NEWS</h1>\r\n");
      out.write("			<div class=\"wrap\">\r\n");
      out.write("				<article>\r\n");
      out.write("					<div class=\"pic\">\r\n");
      out.write("						<img src=\"img/KakaoTalk_20240304_015245193_17.jpg\" alt=\"1번째 콘텐츠 이미지\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h2>\r\n");
      out.write("						<a href=\"https://groundseesaw.co.kr/\">groundseesaw</a>\r\n");
      out.write("						<h2>\r\n");
      out.write("							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>\r\n");
      out.write("				</article>\r\n");
      out.write("				<article>\r\n");
      out.write("					<div class=\"pic\">\r\n");
      out.write("						<img src=\"img/KakaoTalk_20240304_015245193_18.jpg\" alt=\"2번째 콘텐츠 이미지\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h2>\r\n");
      out.write("						<a href=\"https://groundseesaw.co.kr/\">Lorem ipsum dolor sit.</a>\r\n");
      out.write("						<h2>\r\n");
      out.write("							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>\r\n");
      out.write("				</article>\r\n");
      out.write("				<article>\r\n");
      out.write("					<div class=\"pic\">\r\n");
      out.write("						<img src=\"img/KakaoTalk_20240304_015245193_20.jpg\" alt=\"3번째 콘텐츠 이미지\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h2>\r\n");
      out.write("						<a href=\"https://groundseesaw.co.kr/\">Lorem ipsum dolor sit.</a>\r\n");
      out.write("						<h2>\r\n");
      out.write("							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>\r\n");
      out.write("				</article>\r\n");
      out.write("				<article>\r\n");
      out.write("					<div class=\"pic\">\r\n");
      out.write("						<img src=\"img/KakaoTalk_20240304_015245193_26.jpg\" alt=\"4번째 콘텐츠 이미지\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h2>\r\n");
      out.write("						<a href=\"https://groundseesaw.co.kr/\">Lorem ipsum dolor sit.</a>\r\n");
      out.write("						<h2>\r\n");
      out.write("							<p>a amet, consectetur adipisicing elit. Ratione, laudantium.</p>\r\n");
      out.write("				</article>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<footer>\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<div class=\"upper\">\r\n");
      out.write("				<h1>DCODELAB</h1>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"#\">Plicy</a></li>\r\n");
      out.write("					<li><a href=\"#\">Terms</a></li>\r\n");
      out.write("					<li><a href=\"#\">Family Site</a></li>\r\n");
      out.write("					<li><a href=\"#\">Sitemap</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"lower\">\r\n");
      out.write("				<address>\r\n");
      out.write("					Lorem ipsum dolor sit amet consectetur adipisicing elit. Molestias,\r\n");
      out.write("					voluptatem? <br> TEL: 010-7760-3956\r\n");
      out.write("				</address>\r\n");
      out.write("				<p>2020 DCODELAB uuuuummmmm</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- 기업정보 -->\r\n");
      out.write("	</footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
