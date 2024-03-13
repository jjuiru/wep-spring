package component;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class Calculator {
	//실수값 두개를 더해 리턴하는 메소드
	public Double add(double x, double y) {
		return (x+y);
	}
}
