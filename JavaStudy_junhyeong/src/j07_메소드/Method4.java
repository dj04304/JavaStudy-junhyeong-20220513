package j07_메소드;
/**
 * 
 * 질문내용: void 메소드를 탈출할 때, return으로 탈출하는데, 메뉴 1 2 3번에서 return 으로 탈출하면 메인메뉴로 돌아와서 프로그램
 * 종료가 안됨 어떻게 해결해야 할지
 */

import java.util.Scanner;

public class Method4 {
	
	//루프 메소드
	public static void loop() {
		Scanner scanner = new Scanner(System.in);
		boolean loopFlag = true;
		
		while(loopFlag) {
			menu(); //메소드 메인 메뉴
			char select = 0;

			select = scanner.next().charAt(0);
			scanner.nextLine();
			
			if(select == 'q') {
				break;				
			}else if(select == '1') {
				System.out.println("밴드를 선택하셨습니다.");
				menu1(); // 메소드 1번 메뉴
				
			}else if(select == '2') {
				System.out.println("힙합을 선택하셨습니다.");
				menu2(); // 메소드 2번 메뉴
				
			}else if(select == '3') {
				System.out.println("재즈를 선택하셨습니다.");
				menu3(); //메소드 3번 메뉴
			}else {
				error(); // 메소드 에러
			}
		
			System.out.println();
	
		}
		
	}

	//메인 메뉴 메소드
	public static void menu() {
		
		System.out.println("[ 음악 선택 ]");
		System.out.println("1. 밴드");
		System.out.println("2. 힙합");
		System.out.println("3. 재즈");
		System.out.println("q. 프로그램 종료");
		
		System.out.print("메뉴를 선택하세요: ");
	}
	//1번 메뉴 메소드
	public static void menu1() {
		Scanner scanner = new Scanner(System.in);
		boolean loopFlag = true;
		char select = 0;
		
			while(true) {
				System.out.println("[ 밴드 메뉴 ]");
				System.out.println("1. 인디밴드");
				System.out.println("b. 뒤로가기");
				System.out.println("q.프로그램 종료");
				
				System.out.print("보기를 입력해 주세요: ");
				select = scanner.next().charAt(0);
				scanner.nextLine();
				System.out.println();
				
					if(select == '1') {
						System.out.println("인디밴드 1");
						System.out.println("인디밴드 2");
						System.out.print("계속하시려면 엔터를 누르세요");
						scanner.nextLine();
					}else if(select == 'b') {
						break;
					}else if(select == 'q') {
						loopFlag = false;
						break;
					}else {
						error();
					}
			}
		
		
	}
	//2번 메뉴 메소드
	public static void menu2() {
		Scanner scanner = new Scanner(System.in);
		boolean loopFlag = true;
		char select = 0;
		
		while(true) {
			System.out.println("[ 힙합 메뉴 ]");
			System.out.println("1. 언더힙합");
			System.out.println("b. 뒤로가기");
			System.out.println("q.프로그램 종료");
			
			System.out.print("보기를 입력해 주세요: ");
			select = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.println();
				if(select == '1') {
					System.out.println("언더힙합 1");
					System.out.println("언더힙합 2");
					System.out.print("계속하시려면 엔터를 누르세요");
					scanner.nextLine();
				}else if(select == 'b') {
					break;
				}else if(select == 'q') {
					loopFlag = false;
					break;
				}else {
					error();
				}
		}
	}
	
	//3번 메뉴 메소드
	public static void menu3() {
		Scanner scanner = new Scanner(System.in);
		boolean loopFlag = true;
		char select = 0;
		
		while(true) {
			System.out.println("[ 재즈 메뉴 ]");
			System.out.println("1. 퓨전재즈");
			System.out.println("b. 뒤로가기");
			System.out.println("q.프로그램 종료");
			
			System.out.print("보기를 입력해 주세요: ");
			select = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.println();
				if(select == '1') {
					System.out.println("퓨전재즈 1");
					System.out.println("퓨전재즈 2");
					System.out.print("계속하시려면 엔터를 누르세요");
					scanner.nextLine();
				}else if(select == 'b') {
					break;
				}else if(select == 'q') {
					loopFlag = false;
					break;
				}else {
					error();
				}
		}
	}
	
	public static void error() {
		System.out.println("해당 보기는 없습니다.");
		System.out.println("다시 선택해주세요.");
	}
	
	//메인 시작
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		
		System.out.println("프로그램 시작");
		
		loop(); // 루프 메소드;
		
		System.out.println("프로그램 종료");
		
	}

}
