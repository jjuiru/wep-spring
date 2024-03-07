/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-03-06 23:50:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uill.Cookies;

public final class login_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

 Cookies cookies = new Cookies(request);
//static 메소드 사용 but 쿠키 정보를 가져오기 위해서는 사용해야한다.

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\" data-bs-theme=\"auto\">\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"../assets/js/color-modes.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\"\r\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.115.4\">\r\n");
      out.write("<title>Signin Template · Bootstrap v5.3</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"canonical\"\r\n");
      out.write("	href=\"https://getbootstrap.com/docs/5.3/examples/sign-in/\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/@docsearch/css@3\">\r\n");
      out.write("<link href=\"../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"../css/sign-in.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"margin-top: 200px;\">\r\n");
      out.write("	<main class=\"form-signin w-100 m-auto\">\r\n");
      out.write("		");

		if ((String) session.getAttribute("userId") != null)
		// Member member = (Member)session.getAttribute("member");
		//if (member.getId() != null) 
		{
			// 로그인 상태일 때의 출력
		
      out.write("\r\n");
      out.write("		<form action=\"logout.jsp\" method=\"post\">\r\n");
      out.write("			");
      out.print((String) session.getAttribute("userName"));
      out.write("님 로그인 \r\n");
      out.write("			<input style=\"margin-bottom: 10px;\" type=\"submit\" value=\"로그아웃\"> \r\n");
      out.write("			<input style=\"margin-bottom: 10px;\" type=\"button\" value=\"회원정보 수정\" onclick=\"location.href='member_update_form.jsp';\">\r\n");
      out.write("		</form>\r\n");
      out.write("		");

		} else {
		// 로그인되지 않은 상태일 때의 출력
		
      out.write("\r\n");
      out.write("		<form action=\"login.jsp\" method=\"post\">\r\n");
      out.write("			<h1 class=\"h3 mb-3 fw-normal\">로그인</h1>\r\n");
      out.write("\r\n");
      out.write("			");

			if (cookies.exists("email")) {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-floating\">\r\n");
      out.write("				<input style=\"margin-bottom: 10px; border-radius: 10px;\" type=\"text\" class=\"form-control\" id=\"id\" name=\"id\"\r\n");
      out.write("					placeholder=\"id\" value=\"");
      out.print(cookies.getValue("id"));
      out.write("\"> \r\n");
      out.write("					<label for=\"id\">아이디</label>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-floating\">\r\n");
      out.write("				<input style=\" border-radius: 10px;\" type=\"email\" class=\"form-control\" id=\"email\" name=\"email\"\r\n");
      out.write("					value=\"");
      out.print(cookies.getValue("email"));
      out.write("\" placeholder=\"email\">\r\n");
      out.write("				<label for=\"email\">이메일</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

			} else {
			
      out.write("\r\n");
      out.write("			<div class=\"form-floating\">\r\n");
      out.write("				<input style=\"margin-bottom: 10px; border-radius: 10px;\" type=\"text\" class=\"form-control\" id=\"id\" name=\"id\" placeholder=\"id\"> \r\n");
      out.write("				<label for=\"id\">아이디</label>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-floating\">\r\n");
      out.write("				<input style=\" border-radius: 10px;\" type=\"email\" class=\"form-control\" id=\"email\" name=\"email\"\r\n");
      out.write("					placeholder=\"email\">\r\n");
      out.write("				<label for=\"email\">이메일</label>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-check text-start my-3\">\r\n");
      out.write("				<input class=\"form-check-input\" type=\"checkbox\"\r\n");
      out.write("					id=\"check\" name=\"check\" checked> <label class=\"form-check-label\"\r\n");
      out.write("					for=\"check\"> 아이디를 저장합니다. </label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("			<button style=\"margin-bottom: 10px; border-radius: 10px;\" class=\"btn btn-sm btn-outline-secondary w-100 py-2\" type=\"submit\"\r\n");
      out.write("				onclick=\"location.href='login.jsp';\">Sign in</button>\r\n");
      out.write("				</div>\r\n");
      out.write("		</form>\r\n");
      out.write("			<div>\r\n");
      out.write("			<button style= \"margin-bottom: 10px; border-radius: 10px;\" class=\"btn btn-sm btn-outline-secondary w-100 py-2\"\r\n");
      out.write("				onclick=\"location.href='member_join_form.jsp';\">join</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			<div>\r\n");
      out.write("			<button style= \"border-radius: 10px;\" class=\"btn btn-sm btn-outline-secondary w-100 py-2\"\r\n");
      out.write("				onclick=\"location.href='../mainPage.jsp';\">main</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			<p class=\"mt-5 mb-3 text-body-secondary\">&copy; 2024–2027</p>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("	</main>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("	<script src=\"../assets/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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