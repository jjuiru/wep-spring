package spring;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrinter {
	private DateTimeFormatter dateTimeFormatter;
	
	public MemberPrinter() {
		//날짜 정보를 객체생성했다.
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
}
	
	public void print(Member member) {
		if (dateTimeFormatter == null)
		{System.out.println("데이터포멧 객체:"+ dateTimeFormatter);
			System.out.printf(
					"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n", 
					member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		} else {System.out.println("데이터포멧 객체:"+ dateTimeFormatter);
			System.out.printf(
					"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%s\n", 
					member.getId(), member.getEmail(),
					member.getName(), 
					dateTimeFormatter.format(member.getRegisterDateTime()));
		}
	}
//	@Autowired(required = false)
//	@Autowired
//	public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
//		this.dateTimeFormatter = dateTimeFormatter;
//	}
	// 오토와이어드에 (required = false)를 해주면 빈에 등록되지 않아도 일단 세터를 실행시켜준다. 	
	//오토와이어드를 했으나 빈에 등록되지 않아 null일때 Nullable 
		//처리를 하면 null값이 들어가고 기본형식 날짜 데이터가 출력된다.
	
	@Autowired
	public void setDateTimeFormatter(Optional<DateTimeFormatter> formatterOpt) {
		//Optional>널오류를 없애기 위해 나온 클래스다. empty의 값을 넘겨준다.
		// 세터가 돌았기 때문에 null값이 들어간다. 위의 @Nullable한 것과 동일하다.
		if(formatterOpt.isPresent()) {
			// 비어있는지 없는지 empty인지 체크 비어있지 않다면 값을 가져와 저장하고
			this.dateTimeFormatter=formatterOpt.get();
		}else { // 비어있다면 empty면 null을 주입한다.
			this.dateTimeFormatter=null;
		}
	}

}
