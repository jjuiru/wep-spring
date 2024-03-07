package drive;

import dao.MemberTest;
import dto.Member;

public class MemberDaoEx {
 public static void main(String []args) {
	 MemberTest dao = MemberTest.getInstance();
	 Member member = dao.select("admin");
	 System.out.println(member);
	 
	 Member member2 = dao.selectForLogin("hong1", "hong1@naver.com");
	 System.out.println(member2);
	 
	 Member member3 =new Member("test2", "test2@korea.com", "테스트2");
	 dao.insert(member3);
	 
//	 Member member4= new Member("test2", "test4@korea.com", "테스트2");
//	 dao.update(member4);
 }
}
