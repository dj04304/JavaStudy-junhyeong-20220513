package j04_입력;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int A = 0;
//		int B = 0;
//		
//		System.out.print("두 수를 입력하세요: ");
//		A = scanner.nextInt();
//		B = scanner.nextInt();
//		
//		System.out.println("결과: " + (A + B));
		
		int C = 0;
		int D = 0;
		
		System.out.print("두 수를 입력하세요: ");
		
		C = scanner.nextInt();
		D = scanner.nextInt();
		
		String result = (C > D ? ">" 
				: C < D ?  "<" : "==");
		
		
		
		System.out.println("결과: " + result);
	}

}
