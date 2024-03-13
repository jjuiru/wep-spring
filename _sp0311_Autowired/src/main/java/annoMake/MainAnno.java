package annoMake;

import java.lang.reflect.Method;

public class MainAnno {

	public static void main(String[] args) {
		Method[] methodList = MyObject.class.getDeclaredMethods();
		//메소드 타입의 배열변수를 선언=만든 어노테이션 클래스의 메소드 정보를 가져온다.
		
		for(Method method : methodList) {
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				System.out.println(method);
				MyAnnotation annotation=method.getDeclaredAnnotation(MyAnnotation.class);
				String value123= annotation.valeu();
				//객체를 생성해 어노테이션의 값을 가져온다.(문자열)
				System.out.println(method.getName()+":"+value123);
			}
		}
	}
}
