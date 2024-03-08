package spring;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//회원가입 처리를 위한 클래스 
public class RegisterRequest {

	private String email;
	private String password;
	private String confirmPassword;
	private String name;

	//이 클래스에 저장된 패스워드가 확인용 패스워드와 일치하지 않으면 false를 리턴한다. 
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}
	
	//getter setter 자동생성
}
