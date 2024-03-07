package spring;

import java.time.LocalDateTime;

// 회원가입 처리를 위한 Dao
public class MemberRegisterService {
   private MemberDao memberDao;
   //멤버 Dao 의 객체를 필드로 한다. (select, update, insert기능)
   
   public MemberRegisterService(MemberDao memberDao) {
      this.memberDao = memberDao;
      // memberDao객체를 저장
   }
   
   public Long regist(RegisterRequest req) {
	   // 회원가입 처리를 위한 Dto를 매개변수로 한다. (패스워드 저장, 확인)
      Member member = memberDao.selectByEmail(req.getEmail());
      // 회원가입된 이메일(ID)를 멤버 객체에 저장한다.
      if(member != null) {
    	  //해당 Id 멤버 객체가 생성되어있다면 이미 있다는 Message 출력 
         throw new DuplicateMemberException("dup email"+req.getEmail());
      }
      //아니라면 새로운 멤버 객체를 생성해 insert하고, 저장된 id(고유번호)를 리턴한다. 
      Member newMember = new Member(
            req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
      memberDao.insert(newMember);
      return newMember.getId();
   }
}