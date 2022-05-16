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
		
//		System.out.print("값을 입력하세요: ");
//		int num = scanner.nextInt();
//			
//		System.out.println("입력한 값: " + num);
		
		
		
		
		System.out.print("윤년입력: "); //윤년입력
		
		int year = scanner.nextInt(); // year 변수에 정수 입력
		
		String result = year % 4 == 0 
				&& year % 100 != 0 
				|| year % 400 == 0 ? "윤년" : "윤년이 아님"; //윤년 참과 거짓 result값
		
		
		System.out.println(result); //결과

	}

}
