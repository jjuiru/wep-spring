package spring;

import java.time.LocalDateTime;

public class MemberRegisterService {
	private MemberDao memberDao;
	// memberDao의 객체를 필드로 선언

	//객체를 받아 생성자에 넣는다. 
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	// 회원가입 처리정보를 가지고 있는 dto를 가져와 고유 id를 반환한다. 
	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		//회원가입시 입력한 정보의 이메일로 해시맵에 회원등록된 이메일 정보있는지 찾아서 있는지 업는지 비교한다. 
		if (member != null) { // 있다면 중복아이디라는 오류를 발생시킨다.
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}
		Member newMember = new Member( 
				//등록되지않은 새로운 아이디라면  입력받은 값을 멤버에 저장하고 insert를 통해 해시맵에 저장한다. 
				req.getEmail(), req.getPassword(), req.getName(), 
				LocalDateTime.now());
		memberDao.insert(newMember);
		// 그리고 고유 아이디의 값을 반환한다. 
		return newMember.getId();
	}
}
