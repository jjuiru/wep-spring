package practice;

import org.springframework.beans.factory.annotation.Autowired;

public class ChangPasswordSevice {
	
	@Autowired //nullpoint 오류발생하는 곳에 붙인다. 
	private MemberDao memberDao;
	
	public void changePassword() {
		if(memberDao==null) {
			System.out.println("memberDao의 객체가 없습니다.");
		}else {
		memberDao.process();}
		System.out.println("changPassword()");
	}
}
