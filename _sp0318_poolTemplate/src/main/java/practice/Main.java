package practice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	// 로그를 출력해주는 프로그램이다. 
	private static Logger log = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(DbConfig.class,DbQueryConfig.class);
		
		MemberDao dbQuery=ctx.getBean(MemberDao.class);
		int count=dbQuery.count();
		log.info("인원{}명",count); //레코드 갯수를 db에서 받아와 출력
		String memberName= dbQuery.selectMemberName(2);
		log.info("2번 이름: {}",memberName);
		
//		Member dto=new Member("Lee", "Lee@Lee", "123");
//		dbQuery.insert(dto);
		
		Member dtol=new Member(2,"Park","park@park","Park");
		dbQuery.update(dtol);
		log.info("2번 수정: {}",dtol);
		
		List<Member> list= dbQuery.selectAll2();
		for(Member member:list) {
		log.info("{},{},{},{}", member.getMemberno(),member.getId(),member.getPw(),member.getName());
		}
	}
}
