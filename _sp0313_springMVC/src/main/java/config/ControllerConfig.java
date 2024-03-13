package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.HelloController;
// 컨트롤러를 빈으로 등록
@Configuration
public class ControllerConfig {
	@Bean
	public HelloController helloController() {
		return new HelloController();
	}
}
