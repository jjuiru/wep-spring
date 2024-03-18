package servlet;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	// 로그를 출력해주는 프로그램이다. 
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(DbConfig.class,DbQueryConfig.class);
		
		TodoDao dbQuery=ctx.getBean(TodoDao.class);
		int count=dbQuery.count();
		String memberName= dbQuery.selectMemberName(2);
		
//		Member dto=new Member("Lee", "Lee@Lee", "123");
//		dbQuery.insert(dto);
		
		Member dtol=new Member(2,"Park","park@park","Park");
		dbQuery.update(dtol);
		
		List<Member> list= dbQuery.selectAll2();
		for(Member member:list) {
		}
	}
}
