package component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class UserService {
	// 객체선언
	@Autowired
	private Calculator calculator;
	
	public void cal(double a, double b) {
		//두개의 값을 받아 계산클래스를 돌려 결과를 출력한다. 
		double result= calculator.add(a, b);
		System.out.println(result);		
	}
}
