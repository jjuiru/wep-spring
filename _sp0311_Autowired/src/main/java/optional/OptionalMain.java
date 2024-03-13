package optional;

import java.util.Optional;

class Bbb{
	int x;
	public Bbb(int x) {
		this.x=x;
	}
	void print() {
		System.out.println("Bbb:"+x);
	}
}
class Aaa{
	void print(Bbb bb) {
		bb.print();
	}
}
public class OptionalMain {

	public static void main(String[] args) {
		Aaa aa=new Aaa();
		Bbb bb=null; //가정: 값이 예상 안됨.
		
//		if(bb==null) {
//			System.out.println("bb가 null입니다.");
//		}else {
//		aa.print(bb);
//		}
		
		Optional<Bbb> bb1= Optional.ofNullable(bb);
		System.out.println(bb1);
		aa.print(bb1.orElseGet(()->new Bbb(0)));
		//null 이 아니면 기존객체로 프린트 null이면 객체생성해주는 메소드
	}
}
