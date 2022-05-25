package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;

public class UserManagementApplication {

	public static void main(String[] args) {	
		//UserManagementController 생성
		UserManagementController userManagementController = new UserManagementController(); //UserManagementController생성
		userManagementController.createUser();	//userManagementController 안에있는 createUser 호출

	}

}
