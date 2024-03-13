package AutoExQ;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	// 없다면 객체가 없기 때문에 엔진 메소드를 호출시 null이 뜬다.
	//혹은 세터를 만들어 붙여도 된다. 
	//성능 = 생성자>세터>필드객체
	private Engine engine;
	@Autowired
	private Tire tire1;
	@Autowired
	private Tire tire2;
	@Autowired
	private Tire tire3;
	@Autowired
	private Tire tire4;

	public void run() {
		engine.engineRunning();
		tire1.setPostion("왼쪽 앞");
		tire1.roll();
		tire2.setPostion("오른쪽 앞");
		tire2.roll();
		tire3.setPostion("왼쪽 뒤");
		tire3.roll();
		tire4.setPostion("오른쪽 뒤");
		tire4.roll();
	}
}
