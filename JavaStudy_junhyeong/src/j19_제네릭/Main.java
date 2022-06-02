package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
	 System.out.println(controller.createUser());
	 System.out.println(controller.updateUser());
//	 System.out.println(((CMRespDto<User>) controller.getUser()).getData()); //다운캐스팅
	 System.out.println(controller.getUser().getData()); //제네릭 와일드카드를 사용했기 때문에 다운캐스팅을 할 필요가 없다.
	 controller.getAnimal().getData().move();
	}

}
