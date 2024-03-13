package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberSummaryPrinter;
import spring.VersionPrinter;
import spring2.MemberRegisterService;

@Configuration
@ComponentScan(basePackages = {"spring","spring2"},
excludeFilters = @Filter(type=FilterType.ANNOTATION, classes={NoProduct.class,ManualBean.class}))
//필터로 제외시킨다. 
//@Configuration
//@ComponentScan(basePackages = {"spring"}, excludeFilters = @Filter(type=FilterType.REGEX, pattern="spring\\..*Dao"))

//패키기가 같으면 (패키지 이름)를 사용하지 않아도 된다.
public class AppCtx {

//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();
//	}
//	public MemberRegisterService memberRegSvc() {
//		return new MemberRegisterService();
//	}
//	@Bean
//	public ChangePasswordService changePwdSvc() {
//		return new ChangePasswordService();
//	}
//	@Bean
//	public MemberPrinter memberPrinter() {
//		return new MemberPrinter();
//	}
	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
//	@Bean
//	public MemberPrinter memberPrinter2() {
//		return new MemberPrinter();
//	}
	
	@Bean
//	@Qualifier("SummaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
//	@Bean
//	public MemberListPrinter listPrinter() {
//		return new MemberListPrinter();
//	}
//	@Bean
//	public MemberInfoPrinter infoPrinter() {
//		MemberInfoPrinter infoPrinter = new MemberInfoPrinter(); //오토와이어드 주입
//		infoPrinter.setPrinter(memberPrinter2()); //세터에 직접 주입 summary의 프린트 값을 명시적으로 주입한다. (짧은 리스트)
//		return infoPrinter;
//	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
