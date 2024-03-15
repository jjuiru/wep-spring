package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.MemberDao;
import dto.MemberDto;
import service.GetMemberListPrintService;
import service.GetMemberNumService;
import service.LoginCheckService;

@Configuration
public class ServiceConfig {

	@Bean
	public MemberDto memberDto() {
		return new MemberDto();
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}	
	@Bean
	public GetMemberNumService getMemberNumService() {
		return new GetMemberNumService();		
	}
	
	@Bean
	public GetMemberListPrintService getMemberListPrintService() {
		return new GetMemberListPrintService();		
	}
	
	@Bean
	public LoginCheckService loginCheckService() {
		return new LoginCheckService();		
	}
}
