package j12_상속;

public class Test1 extends Test{ // extends + 상속받을 클래스
	
	public Test1() {
		super();// 부모 클래스 생성 / 자신의 주소를 나타내는 것 = this, 부모클래스의 주소를 나타내는 것 = super();
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인: " + super.toString()); // 부모의 주소값 실행 
	}
}
