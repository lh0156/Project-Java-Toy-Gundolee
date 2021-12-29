package Screen;

import java.util.Scanner;

public class MainViewPrint {

	static Scanner scan = new Scanner(System.in);

	public void getMainview() {

		LoginViewPrint loginview = new LoginViewPrint();
		
		String menu = "                                                     1. 로그인 2. 비밀번호 조회 [U: 이전 단계로 M: 메인 화면으로 S: 세이브 후 프로그램 종료]";
		String onlySimbolOfMenu = "1. 로그인 2. 비밀번호 조회 [U: 이전 단계로 M: 메인 화면으로 S: 세이브 후 프로그램 종료]";
		String lien = "                                                     ";

		System.out.println();
		System.out.println(menu);
		System.out.println(HelloMessagePrint.line);

		System.out.print("                                                                              메뉴를 선택하십시오: ");
		String sel = scan.nextLine();

		if (sel.equalsIgnoreCase("1")) {
			loginview.getLoginView();
		} else if (sel.equalsIgnoreCase("2")) {
			
		} else if (sel.equalsIgnoreCase("u") || sel.equalsIgnoreCase("m")|| sel.equalsIgnoreCase("s")) {
			return;
		}
	}
}
