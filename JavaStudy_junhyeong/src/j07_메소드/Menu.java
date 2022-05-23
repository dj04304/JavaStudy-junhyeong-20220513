package j07_메소드;

import java.util.Scanner;

public class Menu {
	
	public static void sleepAndContinue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계속하시려면 엔터를 눌러주세요");
		scanner.nextLine(); // 1 입력시 나타나는 문장
	}
	
	public static char inputSelect() {
		Scanner scanner = new Scanner(System.in);
		char select = 0;
		System.out.print("명령을 입력하세요: "); // 명령(char) 입력
		select = scanner.next().charAt(0);
		scanner.nextLine();
		
		return select;
	}
	
	public static boolean showMenu2() {
		System.out.println("java를 선택하셨습니다.");//1 을 입력했을 때 java를 선택했다고 출력
		System.out.println();
		
		while(true) {
			char select = 0;
			System.out.println("[ java 메뉴 ]"); //메뉴 출력
			System.out.println("1. java란?");
			System.out.println("b. 뒤로가기");
			System.out.println("q. 프로그램 종료");
			
			select = inputSelect();
			
			if(select == 'b') { 
				break; //b 입력시 break가 걸리면서 반복문 탈출(메인 메뉴로 이동)
			}else if(select == 'q') {
				return true;
			}else if(select == '1') {
				System.out.println("자바란 .... 입니다.");
				sleepAndContinue();
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");// 다른 문자 누를 시 다시 입력하게끔 하는 기능
				System.out.println("다시 입력하세요.");
				sleepAndContinue();
			}
			
			System.out.println();
			
		}
		
		return false;
	}
	
	public static boolean showMenu1() {
		while(true) {
			char select = 0; // 명령은 1 2 3 문자이기 때문에 char를 줌 select 선언
			
			System.out.println("[ 메뉴 선택 ]"); // 내용을 출력
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");
			
			select = inputSelect();
			
			//if 시작 부분 띄워줌
			if(select == 'q') { //q를 입력했을 때 break 로 인해 프로그램을 종료시킨다.
				break; // break가 있어야 무한반복이 끝나고 프로그램이 종료할 수 있다.	
			}else if (select == '1') { 
				if(showMenu2()) {
					return true;
				}
				
			}else if (select == '2') {
				System.out.println("python을 선택하셨습니다.");//2 을 입력했을 때 python을 선택했다고 출력
				System.out.println();
				while(true) { //2. 파이썬 메뉴 무한 반복
					System.out.println("[ python 메뉴 ]"); //파이썬 메뉴 출력
					System.out.println("1.python 이란");
					System.out.println("b.뒤로가기");
					
					 inputSelect();
					
					if(select == 'b') {
						break; // b 입력시 반복문탈출, 메인 메뉴로 이동.
					}else if(select == '1') { // 1 입력시 아래 내용 출력
						System.out.println("파이썬이란 ... 입니다.");
						
					}else { // 다른 문자 입력시 아래내용 출력 및 scanner.nextLine(); 안해줘서 바로 반복문으로 이동
						System.out.println("해당 번호는 보기에 없습니다.");
						System.out.println("다시 입력하세요");
					}
					System.out.println();
				}
				
			}else if (select == '3') {
				System.out.println("javascript를 선택하셨습니다.");//3 을 입력했을 때 javascript 선택했다고 출력
				System.out.println();
				while(true) {
					System.out.println("[ javascript 메뉴 ]");//javascript 메뉴 출력
					System.out.println("1. javascript란?");
					System.out.println("b. 뒤로가기");
					
					 inputSelect();
					 
					if(select == 'b') {
						break; //b 입력시 뒤로가기
					}else if(select == '1') {
						System.out.println("javascript란 .... 입니다.");
						sleepAndContinue();
					}else {
						System.out.println("해당 번호는 보기에 없습니다.");
						System.out.println("다시 입력하세요");
						sleepAndContinue();
					}
					System.out.println();
				}
				
			}else {
				System.out.println("해당 번호는 보기에 없습니다."); // 다른 문자열 누를 시 다시 입력하게끔 하는 기능
				System.out.println("다시 입력하세요.");
			}
			
			System.out.println();
		}
	
		return false;
	}



	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		showMenu1();
		
		System.out.println("프로그램 종료"); // 프로그램 종료
		
		
	}

}
