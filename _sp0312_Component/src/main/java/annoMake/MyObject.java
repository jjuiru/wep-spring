package annoMake;

public class MyObject {
	@MyAnnotation //메소드에만 붙일 수 있는 어노테이션
	public void testMethod1() {
		System.out.println("testMethod1()");
	}
	@MyAnnotation //메소드에만 붙일 수 있는 어노테이션
	public void testMethod2() {
		System.out.println("testMethod2()");
	}
}
