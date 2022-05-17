package j04_입력;
/*
 * 소문자 시작 -> 일반 자료형(int char ...) 
 * 
 * 대문자 시작 -> 참조 자료형(String Scanner ...)
 */

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("값을 입력하세요: ");
		int num = scanner.nextInt();
			
		System.out.println("입력한 값: " + num);
		
		System.out.print("두번째 값을 입력하세요: ");
		int num2 = scanner.nextInt();
		
		System.out.println("두번째 값: " + num2);
		
		System.out.println("입력한 값: " + (num + num2));
		
		scanner.next();				//문자열(String)
		scanner.nextLine();			//문자열(String)
		scanner.next().charAt(0);	//문자(char)
		scanner.nextInt();			//정수(int)
		scanner.nextDouble();		//실수(double)

		
		
		
		
//		System.out.print("년도입력: "); //윤년입력
//		
//		int year = scanner.nextInt(); // year 변수에 정수 입력
//		
//		String result = year % 4 == 0 
//				&& year % 100 != 0 
//				|| year % 400 == 0 ? "윤년" : "윤년이 아님"; //윤년 참과 거짓 result값
//		
//		
//		System.out.println(result); //결과

	}

}
