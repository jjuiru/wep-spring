package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private static long nextId = 0;
	// 계정을 식별하기 위한 고유번호를 필드로 지정

	private Map<String, Member> map = new HashMap<>();
	//계정 정보를 저장할 해시맵을 사용

	public Member selectByEmail(String email) {
		//이메일 값을 받고 멥에 저장된 이메일을 가져와 리턴한다. 
		return map.get(email);
	}

	public void insert(Member member) {
		//회원가입시 저장된 member 의 객체에 고유번호+1의 값을 id에 저장하고 해시멥에 저장한다. 
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}

	public void update(Member member) {
		//객체를 받아와 맵에 저장한다. **해시맵이기 때문에 중복값은 다른값으로 대체되어 업데이트를 간단하게 할 수 있다. 
		map.put(member.getEmail(), member);
	}

	public Collection<Member> selectAll() {
		// 멥에 저장된 모든 멤버 객체의 값을 불러온다. (멤버에 tostring 처리가 되어있기 때문에 출력도 가능)
		// 상위 클래스인 컬렉션으로 타입을 정한 이유는 추후 여러가지 타입을 저장시 범위넓게 할 수 있기 때문이다. 
		return map.values();
	}
}
