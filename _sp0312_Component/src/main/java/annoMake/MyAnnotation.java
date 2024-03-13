package annoMake;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //타입이 메소드기 때문에 메소드에만 붙일 수 있다.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String valeu123() default "MyAnnotation : 기본값";
}
