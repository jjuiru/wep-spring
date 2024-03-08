package AutoExQ;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	//AutoWired 를 사용하지 않을 경우는 아래 car 메소드 안에 tire와, engine 메소드를 주입해 사용해야 한다.
	@Bean
	public Car car () {
		return new Car();
	}
	
	@Bean
	public Tire tire() {
		return new Tire();
	}
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
}
