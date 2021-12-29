package Screen;

import java.util.Scanner;

import MemberClass.Person;
import application.Application;

public class LoginViewPrint {
	static Scanner scan = new Scanner(System.in);
	static String height = "                                                    |                                                                                    |";
	static String line = "                                                    |               ";
	static String upBorderLine;
	static String downBorderLine;
	
	public void getLoginView() {

		WarriorPrint warriorView = new WarriorPrint();
		
		String onlySimbolOfMenu = "1. 로그인 2. 비밀번호 조회 [U: 이전 단계로 M: 메인 화면으로 S: 세이브 후 프로그램 종료]";
		int lineLength = checkLength(onlySimbolOfMenu);
		String mainLine = "                                                    |";
		for (int i = 0; i < lineLength - 3; ++i) {
			mainLine += "-";
		}
		mainLine += "|";
		
		upBorderLine = mainLine + "\n" + height + "\n" + height;
		downBorderLine = height + "\n" + height + "\n" + mainLine;

		System.out.println(upBorderLine);
		CenterPrint("아이디: ");
		CenterPrint("비밀번호: ");
		System.out.println(downBorderLine);
		System.out.println();
		System.out.print("                                                                              아이디를 입력하십시오: ");
		String inputId = scan.nextLine();

		checkId(inputId);
	}



	public static void checkId(String inputId) {
		int i = -1;
		String id = "";

		for (Person person : Application.PersonRepository) {
			id += person.getId();
			i=id.indexOf(inputId);
			
		}
		
		if(i!=1){
			
			isLoginView(inputId);
			
		}else {
			System.out.println("존재하지 않는 군번(ID)입니다.");
		}
		
		
	}
	
	private static void isLoginView(String inputId) {
		System.out.println(upBorderLine);
		CenterPrint("아이디: " + inputId);
		CenterPrint("비밀번호: ");
		System.out.println(downBorderLine);
		System.out.println();
		
		System.out.print("                                                                              비밀번호를 입력하십시오: ");
		String inputPassword = scan.nextLine();
		checkPassword(inputId, inputPassword);
		
	}

	public static void checkPassword(String inputId, String inputPassword) {
		int i = -1;
		String password = "";
		String rank = "";
		for (Person person : Application.PersonRepository) {
			password = person.getPassWord();
			i=password.indexOf(inputPassword);
			if(i!=-1) {
				rank=person.getRank();
			}
		}
		
		if(i!=1){
			if(rank.equalsIgnoreCase("StandardOfficer")) {
				OfficerPrint.officerView();
			}else {
				WarriorPrint.warriorView();
			}
		}else {
			System.out.println("유효하지 않은 비밀번호입니다.");
			isLoginView(inputId);
		}
		
	}

	public static void CenterPrint(String input) {

		input = line + input;

		int count = checkLength(height);

		for (int i = 0; i < input.length(); ++i) {

			char te = input.charAt(i);

			if ((int) te > '가' && (int) te < '힣') {
				count -= 2;
			} else {
				count -= 1;
			}
		}

		for (int i = 0; i < count - 1; ++i) {
			input += " ";
		}

		input += "|";

		System.out.println(input);

	}

	private static int checkLength(String input) {
		int length = 0;

		for (int i = 0; i < input.length(); ++i) {

			char te = input.charAt(i);

			if ((int) te > '가' && (int) te < '힣') {
				length += 2;
			} else {
				length += 1;
			}
		}

		return length;
	}
}
