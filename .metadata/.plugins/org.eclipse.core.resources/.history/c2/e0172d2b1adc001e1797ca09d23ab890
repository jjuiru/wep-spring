package spring;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private static long nextId=0;
	private Map<String, Member> map= new HashMap<>();
	//문자열 키값과 Member 객체의 값을 가진 해시맵 생성
	
	public Member selectByEmail(String email) {
		return map.get(email);	
		// 이메일을 맵에 담긴 emial의 해시 주소를 가져온다?
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		// 멤버 객체에 ID를 저장한다. (아이디는 고유값이기 때문에 항상 +1의 값으로 저장) 수동저장방식이네요..
		map.put(member.getEmail(), member);
		// 맵에 새로운 이메일 값과 멤버 객체를 저장한다. 
	}
	public void update(Member member) {
		//이메일(로그인ID) 수정하지 않기 때문에 그대로 넣고 업데이트 한 member 객체만 저장한다. 
		map.put(member.getEmail(), member);
	}
}
