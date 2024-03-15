package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dto.LoginRequest;
import service.GetMemberListPrintService;
import service.GetMemberNumService;
import service.LoginCheckService;

@Controller
public class Mycontroller {
	
	@Autowired
	private GetMemberNumService getMemberNumService;
	@Autowired 
	private GetMemberListPrintService getMemberListPrintService;
	@Autowired
	private LoginCheckService loginCheckService;

	
	@GetMapping("/") //포워딩
	public String root() {
		return "index";
	}
	
	@GetMapping("/loginForm") //이벤트 발생시 요청 형식을 지정한 이름
	public String loginForm() { //메소드 이름 상관 없음
		return "login/loginForm";		//view의 실제 이름을 web.xml로 전송 > 주소값이 붙은 태그가 view로 포워딩 된다. 
	}
	
	@GetMapping("/move") //이벤트 발생시 요청 형식을 지정한 이름
	public String move() { //메소드 이름 상관 없음
		return "redirect:/";		//view의 실제 이름을 web.xml로 전송 > 주소값이 붙은 태그가 view로 포워딩 된다. 
	}
	
	@GetMapping("/join") //이벤트 발생시 요청
	public String join() { //메소드 이름 상관 없음
		return "login/loginJoin";		//view의 실제 이름을 web.xml로 전송 > 주소값이 붙은 태그가 view로 포워딩 된다. 
	}
	
	@PostMapping("/list") //이벤트 발생시 요청
	public String list(LoginRequest loginRequest, Model model) { // 1.dto를 직접 매개변수로 바로 받아 사용하는 방법
		System.out.println(loginRequest.getId());
		System.out.println(loginRequest.getPw()); //포워딩 특성이 요청받은 페이지와 값을 공유할 수 있다는 점이다. 단, 지역변수로 설정한 값은 포워딩 할 수 없다. 
		if(loginCheckService.loginCheckServece(loginRequest.getId(), loginRequest.getPw())) {
			model.addAttribute("memberAllList",getMemberListPrintService.getMemberListPrintService());
			return "login/list";
		}else {
			return "login/loginForm";
		}
		
		
	}	
		
}
