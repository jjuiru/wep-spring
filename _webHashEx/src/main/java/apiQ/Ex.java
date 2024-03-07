package apiQ;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import dao.MemberDao;
import dto.Member;

public class Ex {
// Board에 값이 제대로 저장되었는지 확인하기 위해서 출력한다.
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		HashMap<String,Member> map=dao.select();


		Scanner scan =new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호 입력");
			System.out.println("아이디 : ");
			String id=scan.nextLine();
			System.out.println("비밀번호 : ");
			String email=scan.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).getEmail().equals(email)) {
					System.out.println("로그인성공");
				}
			}
		}
		
	}
}