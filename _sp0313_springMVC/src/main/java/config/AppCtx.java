package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import spring.Client;
import spring.Client2;

@Configuration
public class AppCtx {

	@Bean
	@Scope("prototype") //싱글턴 외 다른방법으로 사용할 경우
	public Client client() {
		Client client = new Client();
		client.setHost("host"); //초기화
		return client;
		
	}
	
	@Bean(initMethod="connect", destroyMethod = "close") //초기화,소멸 메소드 지정
	public Client2 client2() {
		Client2 client = new Client2();
		client.setHost("host"); //초기화
		return client;
		
	}
}
