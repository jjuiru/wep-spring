package spring;

import lombok.Setter;

@Setter
public class MemberInfoPrinter {
	//memberDao와 memberprint 클래스를 필드로 갖는다. 
	private MemberDao memberDao;
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		//이메일 값을 받고 이메일을 찾아와 멤버 객체에 저장한다. 
		Member member = memberDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member); //이름이 존재하면 프린트한다. 
		System.out.println();
	}

}
