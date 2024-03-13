package annoMake2;

import annoMake.MyAnnotation;

public class Target {
	@MyAnno(value="연습입니다.")
	// 어노테이션 추상메소드에 값을 준다.
	@MyAnnotation(valeu123="테스트123")
	public void sub() {
		System.out.println("Target");
	}
}
