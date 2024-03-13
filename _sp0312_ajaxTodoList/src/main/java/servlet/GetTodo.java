package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetTodo
 */
@WebServlet("/GetTodo")
public class GetTodo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTodo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 할 일 목록을 가져오는 코드
		// 이 예시에서는 단순히 두 개의 할 일을 반환합니다.
		//json>자바스크립트를 사용할 수 있게 바꿔준다. 
		List<String> todos=Arrays.asList("첫 리스트","작성 해보기");
		//asList>리터럴 값으로 변환시켜준다.
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
//		이 코드는 HTTP 응답 헤더에 Content-Type을 설정. 
//		여기서는 JSON 형식의 데이터를 전송하고 있으므로 Content-Type을 "application/json"으로 설정. 
//		또한, 문자 인코딩을 UTF-8로 설정합니다.
		
		PrintWriter out = response.getWriter();
		//HTTP 응답을 위한 출력 스트림을 생성
//		out.print("[\"First task\",\"Second task\"]");//아래와 같다. 
		out.print(new Gson().toJson(todos));
		//Gson 라이브러리를 사용하여 todos 리스트를 JSON 형식의 문자열로 변환한 후,
		//출력 스트림에 기록합니다. Gson은 Java 객체를 JSON 문자열로 변환해주는 라이브러리
	    out.flush(); //화면에 보여준다.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
