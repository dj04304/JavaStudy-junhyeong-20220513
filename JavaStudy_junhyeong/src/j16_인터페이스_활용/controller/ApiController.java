package j16_인터페이스_활용.controller;

import j16_인터페이스_활용.service.AuthUserService;
import j16_인터페이스_활용.service.UserService;

public class ApiController {
	
	private final UserService userService; //final 로 Userservice 인터페이스 implements
	
	//종속에 대한 주입 Dependency injection
	public ApiController(UserService userService) { //생성과 동시에 userService 생성 및 매개변수 대입
		this.userService = userService;
	}
	
	public void addUser() {
		System.out.println("사용자 추가");
		userService.create();
	}
	
	public void getUser() {
		System.out.println("사용자 정보 가져오기");
		userService.read();
//		((AuthUserService) userService).test(); 가능하면 다운캐스팅을 하지 않는게 좋다. 틀을 건드리게 되면 다른 설계조차 건드려야되기 때문이다.
	}
	
	public void modifiUser() {
		System.out.println("사용자 정보 수정");
		userService.update();
	}
	
	public void removeUser() {
		System.out.println("사용자 삭제");
		userService.delete();
	}
}
