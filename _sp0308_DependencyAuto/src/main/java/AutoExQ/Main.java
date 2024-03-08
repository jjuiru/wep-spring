package AutoExQ;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppContext.class);
		//메인메소드에 Config클래스를 등록한다. 빈사용을 위해서!
		Car c= ctx.getBean("car", Car.class);
		//Car의 객체를 빈을 통해 생성한다.
		c.run();
		//객체의 메소드 호출
		
		ctx.close();
		//자원을 닫아준다.
	}
}
