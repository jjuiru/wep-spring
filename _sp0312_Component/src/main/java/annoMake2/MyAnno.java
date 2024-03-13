package annoMake2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

	@Target(ElementType.METHOD)
	//적용대상은 method
	@Retention(RetentionPolicy.RUNTIME)
	//유지정책은 런타임이다. 컴파일 이후에도 버추얼머신이 참조한다.
	
	public @interface MyAnno{ //인터페이스 타입의 어노테이션 클래스
		//String 타입으로 사용가능
		public String value(); 
	}

