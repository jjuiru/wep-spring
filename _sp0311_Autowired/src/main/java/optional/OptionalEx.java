package optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String str= "Hello"; //널이 아닌 값을 가지는 문자열 변수
		//optional 객체 생성, 값이 null이 아니므로 of() 메서드 사용
		Optional<String> optionalStr= Optional.of(str);//옵셔널 타입으로 바꿔준다.
		System.out.println(optionalStr);//출력 Optional[Hello]
		
		//값이 null이므로 ofNullable메소드사용
		String nullStr=null;
		Optional<String>optionalNullStr=Optional.ofNullable(nullStr);
		System.out.println(optionalNullStr);//출력 Optional.empty
		
		//값을 갖지않는 빈 객체 생성
		Optional<String>emptyOptional=Optional.empty();
		System.out.println(emptyOptional); //출력 Optional.empty
	}
}
