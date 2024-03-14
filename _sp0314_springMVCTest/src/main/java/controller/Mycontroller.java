package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.LoginRequest;
import service.GetMemberListPrintService;
import service.GetMemberNumService;

@Controller
public class Mycontroller {
	
	@Autowired
	private GetMemberNumService getMemberNumService;
	@Autowired 
	private GetMemberListPrintService getMemberListPrintService;

	
	@GetMapping("/") //포워딩
	public String root() {
		return "index";
	}
	
	@GetMapping("/hello") //이벤트 발생시 요청
	public String hello() { //메소드 이름 상관 없음
		return "hello";		//view의 이름을 web.xml로 전송 > 주소값이 붙은 태그가 view로 포워딩 된다. 
	}
	
	@GetMapping("/login") //이벤트 발생시 요청
	public String login() { //메소드 이름 상관 없음
		return "inputForm";		//view의 이름을 web.xml로 전송 > 주소값이 붙은 태그가 view로 포워딩 된다. 
	}
	
	@GetMapping("/result") //이벤트 발생시 요청
	public String result(LoginRequest loginRequest, Model model) { // 1.dto를 직접 매개변수로 바로 받아 사용하는 방법
		String str="어떤값"; //지역변수이기 때문에 result에 직접 포워딩불가
		model.addAttribute("str",str);//따라서 Model 객체를 만들어 그안에 세팅해준다. 
		System.out.println(loginRequest.getId());
		System.out.println(loginRequest.getEmail()); //포워딩 특성이 요청받은 페이지와 값을 공유할 수 있다는 점이다. 단, 지역변수로 설정한 값은 포워딩 할 수 없다. 
		System.out.println(getMemberNumService.getNumRecords());
		model.addAttribute("recordsNum",getMemberNumService.getNumRecords());
		return "result";
	}
//	@GetMapping("/result") //이벤트 발생시 요청
//	public String result(@RequestParam String id,@RequestParam String email) { // 2.어노테이션 태그로 받아 사용하는 방법
//		System.out.println(id);
//		System.out.println(email);
//		return "result";
//	}
//	public String result(HttpServletRequest request) {//3. 서블렛 리퀘스트를 사용해 메소드 이름 상관 없음 값을 받는 매개변수 작성
//		String id=request.getParameter("id");
//		System.out.println(id);
//		return "result";		//view의 이름을 web.xml로 전송 > 주소값이 붙은 태그가 view로 포워딩 된다. 
//	}
//	
	@GetMapping("/move") //이벤트 발생시 요청 형식을 지정한 이름
	public String move() { //메소드 이름 상관 없음
		return "redirect:/";		//view의 실제 이름을 web.xml로 전송 > 주소값이 붙은 태그가 view로 포워딩 된다. 
	}
	
	@GetMapping("/list") //이벤트 발생시 요청
	public String list(Model model) { // 1.dto를 직접 매개변수로 바로 받아 사용하는 방법 
		System.out.println(getMemberNumService.getNumRecords());
		model.addAttribute("memberAllList",getMemberListPrintService.getMemberListPrintService());
		return "list";	
	}
}
