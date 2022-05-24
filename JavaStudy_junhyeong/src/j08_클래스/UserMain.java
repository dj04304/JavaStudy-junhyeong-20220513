package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
		User user1 = new User();
		System.out.println("첫번째: " + user1.name);
		System.out.println("메인메소드에서 호출: " + user1);
//		user1.name = "박준형";
		user1.setName("aaaa");
		System.out.println("두번째: " + user1.name);

		User user2 = new User("김준일", "29", "01012341234", "부산");//this로 생성하자마자 값을 넣어줌
		
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phone);
		System.out.println(user2.address);//user2에 담은 User 클래스의 값을 출력
	}

}
