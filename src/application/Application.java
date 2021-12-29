package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import MemberClass.Person;
import MemberClass.PersonClass;
import Screen.HelloMessagePrint;
import Screen.LoginViewPrint;
import Screen.MainViewPrint;
import load.PersonLoad;

public class Application {

	public static ArrayList<Person> PersonRepository = new ArrayList<Person>(); 
	public Scanner scan = new Scanner(System.in);
	public String sel = "Don`t Input Sel";
	
	public static void main(String[] args) throws IOException {
		
		try {
		
		//Object Declaration
		HelloMessagePrint helloMessageprint = new HelloMessagePrint();
		MainViewPrint mainViewprint = new MainViewPrint();
		
		//Data Load
		
		PersonLoad personLoad = new PersonLoad();
		personLoad.getPersonLoad();
		PersonRepository = personLoad.PersonRepository;
		
		
		
			
		//Print
		helloMessageprint.getHelloMessage();
		mainViewprint.getMainview();
		
		} catch (Exception e) {

		}
	}

}
