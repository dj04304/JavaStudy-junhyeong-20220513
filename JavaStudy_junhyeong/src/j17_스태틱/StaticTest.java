package j17_스태틱;

/*
 * 스태틱 메소드를 모아둘 예정
 * 외부에서 바로 접근을 해야 할 경우, public을 사용
 */

public class StaticTest {
	
	//스태틱으로 선언 시, 글자모양이 바뀜
	public static int count;
	
	public static void staticMethod() { //메소드 생성
		
		System.out.println("스태틱 메소드 [ " + count + " ]");
	}
	
	
	
}
