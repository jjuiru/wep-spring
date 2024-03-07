package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppContext.class);
		//자동으로 해당 클래스의 객체를 생성해서 실행시켜준다. 
		Greeter g= ctx.getBean("greeter", Greeter.class);
		//안녕하세요가 저장된 greeter의 객체 호출
		String msg=g.greet("스프링");
		//스프링 매개변수를 주고 호출하면
		System.out.println(msg);
		//스프링, 안녕하세요! 가 호출된다.
		ctx.close();
	}
}
