package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {

	//생성할 객체를 필드로 선언한다. 
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;

	//이를 조립하는 메소드를 실행하고 생성자에 매개변수가 필요한 것들은 의존성을 주입해준다.
	public Assembler() {
		memberDao = new MemberDao();
		//Dao객체 생성
		regSvc = new MemberRegisterService(memberDao);
		//Dao가 필요한 RegisterService 메소드에 객체를 주입한다. 
		pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
		// 세터를 통해서 주입받는다.
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}

	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}

}
