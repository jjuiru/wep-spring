package config;


import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.Mycontroller;
import dao.MemberDao;
import service.GetMemberListPrintService;
import service.GetMemberNumService;

// 컨트롤러를 빈으로 등록
@Configuration
public class ControllerConfig {
	@Bean
	public Mycontroller myController() {
		return new Mycontroller();		
	}
}
