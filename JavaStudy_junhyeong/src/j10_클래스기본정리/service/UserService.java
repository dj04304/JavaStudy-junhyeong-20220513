package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {

	private Scanner scanner; //Scanner 선언(UserService가 생성될 때 입력받을 수 있게끔 선언만함)
		//생성을 하지 않는 이유는 사용하지 않을 때도 메모리를 잡아먹고 있기 때문이다.
	
	public UserService() { 
		scanner = new Scanner(System.in); //생성과 동시에 입력
	}
	
	public User insertUser() { //User 자료형이기 때문에 return값은 User 이다.
		

		showInsertView(); //메소드호출
		
		String usercode = null; //선언 및 초기화
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		System.out.print("사용자 번호입력: "); //출력과 입력
		usercode = scanner.nextLine();
		System.out.print("이메일: ");
		email = scanner.nextLine();
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("사용자이름: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		

		User user = new User(usercode, email, name, username, password); //생성과 동시에 입력을 받아서 return user
		
		
		return user; //User 클래스로 만든 객체 user값을 return해준다.
		
	}
	
	private void showInsertView() { //메소드 생성 캡슐화를 해준 이유는 굳이 외부에서 쓸 일이 없기 때문이다.
		System.out.println("[ 사용자 추가 ]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
	
}
