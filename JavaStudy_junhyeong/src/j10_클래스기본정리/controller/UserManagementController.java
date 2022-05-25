package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {//클래스 내에 선언하는 모든것은 private으로 한다.
	
	private UserService userService; //UserService 선언
	//다른 곳에서 쓰고싶으면 무조건 getter&setter 써서 가져와야한다.
	
	public UserManagementController() { //UserManagementController 생성자
		
		userService = new UserService(); //UserService 생성
	}
	
	public void createUser() {
		User user = userService.insertUser(); //userService 안의 inserUser 호출
		
		System.out.println("[ 새로 추가된 사용자 ]"); 
		System.out.println(user.toString()); //user.toString 출력
	}

	public void updateUser() {
		
	}
	
}
