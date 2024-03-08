package spring;

public class DuplicateMemberException extends RuntimeException {

	public DuplicateMemberException(String message) {
		super(message);
		//이미 계정이 중복으로 있을 때 오류처리
	}

}
