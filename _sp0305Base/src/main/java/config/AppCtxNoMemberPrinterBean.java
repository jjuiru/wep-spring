package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;
import spring.VersionPrinter;

// 빈 등록 공장입니다. Configuration은 빈을 모아 관리해줍니다. spring 컨테이너
@Configuration
public class AppCtxNoMemberPrinterBean {
	//Appctx도 일종의 빈이라고 취급한다.

	@Bean  
	public MemberDao memberDao() {
		// 멤버 관리 Dao의 객체를 생성하여 리턴합니다. 
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		// 
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao());
		return pwdSvc;
	}
	
	private MemberPrinter printer=new MemberPrinter();
//	@Bean
//	public MemberPrinter memberPrinter() {
//		return new MemberPrinter();
//	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao(), printer);
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(printer);
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
	
	
}




