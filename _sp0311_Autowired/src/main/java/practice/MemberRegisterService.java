package practice;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {

	@Autowired// 오토와이어드 테스트> 성공
	private MemberDao memberDao;
	
	
	// 오토와이어드 테스트> 성공 @Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}


	//오토와이어드 테스트>실패 생성자에는 붙이지 않는다. @Autowired
	public MemberRegisterService() {
		super();
		this.memberDao = memberDao;
	}


	public void regist() {
//		memberDao.process(); //의존관계 넣기
		if(memberDao==null) {
			System.out.println("memberDao가 null입니다.");
		}else {
			System.out.println("memberDao의 wire가 적용되었습니다.");
		}
		
		System.out.println("regist()");
	}
}
 