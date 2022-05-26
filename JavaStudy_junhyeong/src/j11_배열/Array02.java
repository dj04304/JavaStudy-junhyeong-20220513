package j11_배열;

public class Array02 {

	public static void main(String[] args) {
//		int size = 4; //size 에 정수 4를 담음
//		int[] numbers = new int[size]; //numbers 의 크기를 size의 숫자(개수)로 담음
//		
//		
//		System.out.println(numbers.length);
		
		/*
		 * for문으로 0부터 99까지 반복을 한다
		 * 변수 i의 값이 8의 배수이면
		 * 8의 배수 갯수만큼 배열을 생성하고
		 * 8의 배수를 모두 배열에 대입한다.
		 * 배열에 들어있는 8의 배수들을 모두 출력하시오.
		 * 배열에 넣는 for문과 출력하는 for문이 따로 있어야 한다.
		 */

		int size = 0;

		//배열의 크기를 구하는 반복문
		for(int i = 0; i < 100; i++) { // 0 ~ 99까지 반복
			if(i != 0 && i % 8 == 0) { // 0을 제외한 8의 배수
				size++; // 0 을 제외한 8의 배수일때마다 size 1씩 증가
				//8의 배수의 개수가 나옴
			}
		}
			int[] numArray = new int[size]; //배열 안에 8의 배수의 개수만큼 만들어줌
				//값은 0이다.
		
		//배열안의 숫자(8의 배수)를 구하는 반복문
		for(int i = 0, j = 0; i < 100; i++) {
			if(i != 0 && i % 8 == 0) { //0이아닌 8의 배수일때
				numArray[j] = i; // 배열에 8을 넣어라
				System.out.println(numArray[j]); //배열 안의 숫자를 출력
				j++;//j를 증가시켜줘야함(그 다음 배열에 넣어야 되기 때문에)
			}
		}
		
		//배열안의 숫자를 배열크기만큼 출력
//		for(int i = 0; i < numArray.length; i++) { //배열의 크기만큼 반복
//			System.out.println(numArray[i]); //배열 안의 숫자를 출력
//		}
			
	
	}
		
	
}


