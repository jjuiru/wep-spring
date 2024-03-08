package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import assembler.Assembler;
import spring.ChangePasswordService;
import spring.DuplicateMemberException;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.WrongIdPasswordException;

public class MainForAssembler {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		// 버퍼를 통해 입력한 문자열을 읽어오고 그걸 읽어오기 쉽게 만들어주는 버퍼리더를 만든다.
		while (true) {
			System.out.println("명령어를 입력하세요:");
			String command = reader.readLine();
			//버퍼 리더에서 명령어를 받아 읽는다. 
			if (command.equalsIgnoreCase("exit")) {
				//읽어온 명령어에 exit이면 대소문자를 무시하고 문자를 비교한다.
				System.out.println("종료합니다.");
				break;
			}
			if (command.startsWith("new ")) {
				// startsWith은 new로 시작한다면 실행된다는 뜻이다. 
				processNewCommand(command.split(" "));
				//빈칸을 통해서 문자열을 나누어 읽어온다. 그 값을 실행해줄 메소드에 담는다. 메소드는 아래에 있다. 
				continue;
			} else if (command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			}
			printHelp();
			//두개의 코맨드가 모두 틀리다면 사용설명서를 출력해준다. 
		}
	}

	private static Assembler assembler = new Assembler();
	//조립기를 호출한다. (생성한 객체들을 모두 가져와 사용할 수 있다.)

	private static void processNewCommand(String[] arg) {
		// new라고 입력후 입력문자열의 5개가 아니라면 다시 돌아간다. 
		//문자열 갯수가 정확하다면 
		if (arg.length != 5) {
			printHelp();
			return;
		}
		
		MemberRegisterService regSvc = assembler.getMemberRegisterService();
		//new를 사용하지 않고 assembler에 저장되어있는 객체를 가져온다.
		RegisterRequest req = new RegisterRequest();
		//service를 하이기위한 dto 객체를 가져온다.
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);
		// dto에 저장
		
		if (!req.isPasswordEqualToConfirmPassword()) {
			//패스워드 확인을 위해서 입력한 두 값이 일치하지 않으면 다시 돌아간다.
			System.out.println("암호와 확인이 일치하지 않습니다.\n");
			return;
		}
		try { // 일치하다면 값을 회원가입 처리 메소드에 넘겨 아이디가 있는지 등을 검사하여 등록한다.
			
			regSvc.regist(req);
			System.out.println("등록했습니다.\n");
		} catch (DuplicateMemberException e) {
			//만약에 아이디가 중복이라면 서비스에서 발생시킨 오류처리가 된다. 
			System.out.println("이미 존재하는 이메일입니다.\n");
		}
	}

	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}
		ChangePasswordService changePwdSvc = 
				assembler.getChangePasswordService();
		try {
			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("암호를 변경했습니다.\n");
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.\n");
		} catch (WrongIdPasswordException e) {
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}
	}

	private static void printHelp() {
		System.out.println();
		System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
		System.out.println("명령어 사용법:");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println("list 가입 정보 리스트 확인");
		System.out.println("info 메인으로 돌아가기");
		System.out.println("version 확인하기");
		System.out.println();
	}
}