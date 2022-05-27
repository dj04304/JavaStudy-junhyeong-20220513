package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		
		/*
		 * 1, 2, 3, 4, 5, 6, 7, 8
		 */
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length - 1 != i ? ", " : ""));
		}
		
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i]);
			
			if(numbers[i] == numbers.length) {
				System.out.print("");
			}else {
				System.out.print(", ");
			}
			
		}
		
		System.out.println();
		
		//foreach 구문
		
		for(int num : numbers) { // 배열에 들어있는 값을 반복마다 int num 에 담아준다. 자료형을 동일하게 사용해줘야한다. int String 등등
			System.out.print(num + (numbers.length !=  num  ? ", " : ""));
		}
		
	}

}
