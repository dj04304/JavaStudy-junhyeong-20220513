package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {//클래스 내에 선언하는 모든것은 private으로 한다.
	
	private UserService userService; //UserService 선언
	private User[] users; //배열 선언
	//다른 곳에서 쓰고싶으면 무조건 getter&setter 써서 가져와야한다.
	
	public UserManagementController(UserService userService) { //UserManagementController 생성자
		this.userService =  userService; //UserService 생성
		users = new User[2]; //배열에 5개의 값을 넣을 수 있다. 배열도 생성과 동시에 생성해줌 
	}
	
	public void createUser() {
		int indexResult = findUserEmptyInUsers(); //findUserEmptyInUsers 메소드 호출
		if(indexResult != -1) { // indexResult의 값이 -1 이아니라면 사용자가 추가됨
			
			users[indexResult] = userService.insertUser(); //users의 빈 공간에 userService 안의 inserUser 호출
			
			System.out.println("[ 새로 추가된 사용자 ]"); 
			System.out.println(users[indexResult].toString()); //index내의 toString 을 출력한다.
		}else { // indexResult 의 값이 -1이라면 사용자를 추가할 수 없다.
			System.out.println("더 이상 사용자를 추가할 수 없습니다.");
		}
	
	}

	private int findUserEmptyInUsers() { //클래스가 생성될 때 비어있는 곳이 있는지를 체크하는 역할
		for(int i = 0; i < users.length; i++) { //users 배열 크기만큼 반복
			if(users[i] == null) { //users의 배열에 null이 들어있다면(비어있으면 null이 들어있음)
				return i;
			}
		}
		return -1; //빈 공간이 없다. (for문이 끝나고 return된다.)
	}
	
	public void updateUser() {
		
	}
	
}
