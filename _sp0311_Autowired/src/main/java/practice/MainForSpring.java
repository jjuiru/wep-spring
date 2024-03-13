package practice;

import javax.swing.text.ChangedCharSetException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		MemberRegisterService mrs = ctx.getBean(MemberRegisterService.class);
		mrs.regist(); //원하는 원본메소드 호출
		
		ChangPasswordSevice cps= ctx.getBean(ChangPasswordSevice.class);
		cps.changePassword();
		
		ctx.close(); //자원반납, 사실 직접 안해도 상관은 없다.
	}
}
