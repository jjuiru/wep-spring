package spring;

import java.util.Collection;

public class MemberListPrinter {
	//멤버dao와 printer 클래스를 필드로 갖는다. 
	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	} // 외부에서 두가지의 객체를 전달받고 저장

	public void printAll() { //모든 계정을 프린트하는 메소드
		Collection<Member> members = memberDao.selectAll();
		// 모든 객체의 값을 해시에 저장한다. 
//		members.stream().forEach(a -> {
//			printer.print(a);
//		});
		members.forEach(m -> printer.print(m));
		//람다식을 이용해서 가져온 객체를 하나씩 프린트한다. 
//		for (Member member : members) {
//			printer.print(member);
//		}
	}
}
