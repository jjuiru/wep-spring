package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello") 
	// 매핑형식을 정해주는 어노테이션 , 프로젝스 실행후 주소에 /hello를 넣으면 다음 메소드가 리턴된다.
	// /만 하면 서블렛 실행시 바로 hello view로 이동 /he도 동일하다.
	public String hello() { //hello라는 문자열을 리턴해주는 클래스 내부적으로 view의 이름을 받아 주소형식으로 바꿔준다.
		return "hello";
	}
}
