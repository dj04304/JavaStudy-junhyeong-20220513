package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) {
		System.out.print("Hello, Java");
		System.out.println("Hello, Java");
		System.out.print(10 + 5);
		System.out.println();
		
		int age = 29;
		
//		double age = 10.5; << 중복불가
		
		System.out.print("이름: ");
		System.out.println("박준형");
		System.out.print("직업: ");
		System.out.println("학생");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = 30;
		
		System.out.print("이름: ");
		System.out.println("박준형");
		System.out.print("직업: ");
		System.out.println("학생");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = age + 2;
		
		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
		
		/*
		 * 변수
		 * 
		 * 변수명은 영어(대문자,소문자)나 숫자만 가능하며
		 * 특수문자는 $,_ 만 가능하다.
		 * 시작어로 숫자는 불가능
		 * 자바내의 예약어 사용 X (ex: calss static 등등)
		 * 
		 */
		
		/*
		 * 메모리
		 * 
		 * 비트, 바이트
		 * 
		 * 논리형 - boolean(1bit): trueAndFalse 0은 거짓, 0이 아닌 나머지는 참
		 * 문자형 - char(character, 2byte): 문자
		 * 정수형 - int(4byte)
		 * 			long(8byte)
		 * 실수형 - double(8byte)
		 * 
		 */
	}
}
