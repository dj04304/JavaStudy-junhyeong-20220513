package j16_인터페이스_활용;

import j16_인터페이스_활용.controller.ApiController;
import j16_인터페이스_활용.service.AuthUserService;
import j16_인터페이스_활용.service.OAuth2UserService;

public class Main {
	
	public static void main(String[] args) {
		ApiController companyA = new ApiController(new AuthUserService()); //생성자에 주입하는것에 따라 내용이 달라진다.
		companyA.addUser();
		companyA.getUser();
		companyA.modifiUser();
		companyA.removeUser();
	
	}

}
