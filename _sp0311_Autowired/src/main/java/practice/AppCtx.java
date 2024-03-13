package practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();		
	}
	
	@Bean
	public MemberRegisterService memberRegisterService() {
		return new MemberRegisterService();	//객체를 생성한 후 리턴한다.	
	}
	
	@Bean
	public ChangPasswordSevice changePassword() {
		return new ChangPasswordSevice();		
	}
//	
//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();		
//	}
//	
//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();		
//	}
	
}
