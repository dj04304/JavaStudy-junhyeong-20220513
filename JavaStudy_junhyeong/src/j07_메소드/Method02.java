package j07_메소드;

//class 안에 정의된 함수를 메소드라고 한다.
/**
 * 
 * void => 공허함, 반환(return)할 값이 없다.
 *
 */
public class Method02 {
	
	//매개변수가 없으면서 반환도 없는 메소드
	public static void test1() { // 3.메인 함수가 실행됨
		System.out.println("test1 메소드 실행");
	}
	
	//매개변수는 있고 반환이 없는 메소드
	public static void test2(int age, int year) {// 값을 받고 출력 , ()안에 있는 것들을 매개변수라고 한다.
		System.out.println("나이: " + age); // 받은 첫번째 값을 출력
		System.out.println("출생년도: " + year);// 받은 두번째 값을 출력
	}
	
	//매개변수가 없고, 반환이 있는 메소드(클래스)
	public static String test3() { // 매개변수가 없기 때문에 ()안을 비워준다.
		return "김준일"; // 문자열 반환
	}
	//매개변수가 없고, 반환이 있는 메소드(자료형)
	public static int test4() {
		return 10000;
	}
	
	//매개변수도 있고 반환도 있는 메소드
	public static String test5(String name, int num) {// 문자열 + 정수 = 문자열 이기 때문에 가능하다.
		return name + num; 
	}
	
	// 리턴 자료형이 void일 때, 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return; // return을 사용하면 메소드 자체를 종료하기때문에 밑에 글귀가 출력이 안됨
						// break 를 사용하면 반복문을 종료하기 때문에 글귀 출력 후 종료
						// return도 마찬가지로 뒤에 system.out.println이 오류가 남
//				System.out.println();
			}
		}
		System.out.println("test6가 정상 종료되었습니다.");
	}
	
	public static void main(String[] args) {// 메인함수가 먼저 실행
		System.out.println("메인함수 시작"); // 1.먼저 출력
		test1(); // 2.메소드 호출
		test2(29, 1994); // 메소드가 호출하면서 변수에 값을 대입해줌
		test3(); // 출력을 하지 않았기 때문에 실행해도 나타나지않지만, test3 자체가 값이다.
		System.out.println(test3());// test3자체가 값이기 때문에 이런식으로 출력가능.
		String name = test3();// 변수에 담는것도 가능하다.
		System.out.println(name);// 변수에 담아서 출력
		System.out.println(test4());
		System.out.println(test5("김준일", 1));
		test6();
		System.out.println("메인함수 끝"); // 4.메인 함수 끝
		
		
	}

}
