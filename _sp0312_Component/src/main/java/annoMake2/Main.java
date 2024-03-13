package annoMake2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import annoMake.MyAnnotation;
import annoMake.MyObject;

public class Main {

	public static void main(String[] args) throws Exception {
		//일반 클래스 객체 생성은 같은 패키지 내에서만 가능하다.new~
		
		String className ="annoMake2.Target"; 
		//클래스의 이름을 문자열로 저장, 이 방식은 라이브러리에 있는 클래스 파일들도 가져올 수 있다.
		Class<?> cls=Class.forName(className); // 클래스 이름을 가져와 저장
		//모든 타입의 클래스를 받을 수 있다. (광범위)
		Target a= (Target) cls.getDeclaredConstructor().newInstance();
		//선언된 생성자를 가져오고.새로운객체를 생성하고 타입을 target 으로 변환한다. 
		a.sub(); //객체생성된 클래스의 메소드 실행
		
		Method[] methods= cls.getDeclaredMethods(); //메소드가 생성된것을 모두 가져온다.
		for(int i=0; i<methods.length; i++) {
			if(methods[i].isAnnotationPresent(MyAnno.class)) {
				MyAnno myAnno =methods[i].getAnnotation(MyAnno.class);
				System.out.println(myAnno.value());
			}
			if(methods[i].isAnnotationPresent(MyAnnotation.class)) {
				System.out.println(methods[i]);
				MyAnnotation annotation=methods[i].getDeclaredAnnotation(MyAnnotation.class);
				String value123= annotation.valeu123();
				//객체를 생성해 어노테이션의 값을 가져온다.(문자열)
				System.out.println(methods[i].getName()+":"+value123);
			}
		}
		
		
		Method method = Target.class.getMethod("sub");
		// 메소드 타입의 변수를 선언=만든 어노테이션 클래스의 메소드 정보를 이름으로 가져온다.
		Annotation[] annotations=method.getAnnotations();

		for (Annotation anno : annotations) {
			MyAnno myAnno=(MyAnno) anno; //이 코드 때문에 두개의 어노테이셔을 쓸 경우 오류가 난다. 
			System.out.println(myAnno.value());
		}
	}

}
