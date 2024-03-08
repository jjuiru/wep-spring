package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConf1;
import config.AppConf2;
import config.AppCtx;
import spring.ChangePasswordService;
import spring.DuplicateMemberException;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.VersionPrinter;
import spring.WrongIdPasswordException;

public class MainForSpring3ContigTest {

	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException {
		ctx = new AnnotationConfigApplicationContext(AppConf1.class, AppConf2.class); // configration 클래스를 여러 개 등록 할 수 있다. 
	
		//@Configuration 의 해당 객체도 Bean으로 취급한다는 뜻이다. 
		AppConf1 apConf1= ctx.getBean(AppConf1.class);
		System.out.println(apConf1 !=null);
		
		// 널인지 아닌지 여부확인
	}
}