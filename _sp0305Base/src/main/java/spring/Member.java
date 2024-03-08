package spring;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString

//계정 관리 Dto 고유 프라이머리 키인 id, 이메일 비밀번호 이름 현재 시간의 정보를 저장한다
//생성자 메소드 1-고유번호를 제외한 네 가지의 값을 받아 생성자를 만들고 저장한다. 
//패스저장메소드 2-구비번과 신비번의 값을 받아 현재 저장된 패스워드와 비교해 틀리면 오류를 발생시키고 맞다면 신비번을 저장한다. 
public class Member {

	private Long id; // 오토로 생성될걸?
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;

	// 아직 db연동이 되지 않기 때문에 member 메소드에 직접 값을 저장한다.
	//id의 값은 여기서 처리하지 않고 Dao에서 처리후 이곳에 저장한다.
	public Member(String email, String password, 
			String name, LocalDateTime regDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = regDateTime;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (!password.equals(oldPassword))
			throw new WrongIdPasswordException();
		this.password = newPassword;
	}

}
