package j02_변수와_상수;

/*
 * 클래스 -> 첫 글자 대문자
 * 메소드와 변수 -> 소문자 및 카멜표기법
 * 상수 -> 대문자
 */
public class MaxMin {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100; //상수는 대문자로 표기
		final int MIN_NUMBER;
		MIN_NUMBER = 0;
		
		final String PATH = "C:\\junil\\junhyeong\\workspace";
		
		final double PI = 3.14;
		
		System.out.println("최댓값: " + MAX_NUMBER);
		System.out.println("최솟값: " + MIN_NUMBER);
		
		
	}
}
