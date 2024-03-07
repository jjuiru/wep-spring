package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2_Singleton {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1= ctx.getBean("greeter",Greeter.class);
		Greeter g2= ctx.getBean("greeter",Greeter.class);
		System.out.println("(g1==g2)="+(g1==g2));
		// 두 값의 비교시 true 이므로 싱글턴 객체라는걸 알 수 있다. 
		ctx.close();

	}

}
