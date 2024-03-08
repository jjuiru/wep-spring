package spring;

//패스워드를 바꿔주는 서비스
public class ChangePasswordService {

	//멤베 crud클래스를 필드로 갖는다. 
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
    //넘겨받은 memberDao의 객체를  필드에 저장한다. 
		this.memberDao = memberDao;
	}
	
//검색할 이메일과 옛날비번 새비번을 받아 이메일이 일치하다면 업데이트한다.
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if (member == null)
			throw new MemberNotFoundException();
//멤베 메소드인 changepass를 통해 멤버에 저장
		member.changePassword(oldPwd, newPwd);
//해시멥에 한번 더 저장해야 완벽하게 저장되기 때문에 꼭 바꾼 후 Dao를 통해 업데이트 한다. 
		memberDao.update(member);
	}



}
