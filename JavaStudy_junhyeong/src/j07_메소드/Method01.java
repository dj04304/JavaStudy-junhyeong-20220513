package j07_메소드;

import java.util.Scanner;
/**
 * 
 * 함수는 동사형태, 변수는 명사형태로 만들어 준다.
 *
 */
public class Method01 {
	
	public static int calcformula1(int a, int b, int c, int d, int e) { //a b c d e 를 int 로 담음 (입력)
		int result = a + (b * c) - (d * e); // 수식을 result 에 담는다.
		return result; //결과를 return받음 (출력)
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, e;
		int r1, r2, r3, r4 = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		
		// x + y = z
		
		r1 = calcformula1(a, b, c, d, e); // formula1호출
		// 소스코드 만줄
		r2 = calcformula1(10, 20, 5, 30, 2);
		// 소스코드 천줄
		r3 = calcformula1(a, b, c, d, e);
		// 소스코드 이천줄
		r4 = calcformula1(a, b, c, d, e);
		// 소스코드가 길어졌을 때 이 수식들을 다 기억하기 힘들다.
		// 그래서 공장을 만들어 값을 넣고 불러와줄것인데 이를 함수라고한다.
		// 호출과 반환이 기본 구성인데, 반환은 없을 수도 있다.
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
