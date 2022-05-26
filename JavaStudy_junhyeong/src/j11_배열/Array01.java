package j11_배열;

/**
 * 
 * 컴퓨터는 순서대로 메모리에 넣지 않는다. 적절한 위치에 할당한다.
 * 때문에 메모리(주소)를 다 외울수 없어서 이를 변수에 담아 사용한다.
 * 
 * 배열을 배우는 이유: 변수명은 건드릴 수 없기 때문에 변수명끼리는 더할 수 없다.
 * 자료형이기 때문에 int[] 자리에 일반자료형, 참조자료형 모두 올 수 있다.
 *
 *자료형 3가지 : 일반 자료형(int num)
 *			참조 자료형 -> calss // Array
 */

public class Array01 {

	public static void main(String[] args) {
		//1. 배열의 공간(크기)을 정해서 생성, 값을 넣어주기 까지는 빈 공간이다.
		int[] numbers = new int[10]; //10개로 묶은 주소를 numbers 에 담아라. int값을 담는 배열(자료형이다.)
		
		//2. 배열에 들어갈 값을 미리 정해서 생성, {}내에 있는 개수만큼 공간이 생성됨
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5]; //String 은 클래스이다. 즉, 클래스도 배열로 선언할 수 있다.
		String str = "test"; //클래스는 주소값을 받는다, 문자열이라는 것은 일종의 리터럴 주소값이다.
		
		System.out.println("numbers의 길이: " + numbers.length);
		System.out.println("strArray의 길이: " + strArray.length);
		
 		for(int i = 0; i < numbers.length; i++) { //numbers의 크기만큼 반복해준다.
			System.out.println("i: " + i);
			System.out.println("numbers: "+numbers[i]);
			System.out.println("numbers2: " + numbers2[i]);
			//System.out.println(strArray[i]); 크기가 5기 때문에 오류가 난다.(IndexOutofBoundsException)
		}
		
		numbers[0] = 10; //numbers의 0번째에 10을 담아라
		numbers[1] = 20; //numbers의 0번째에 20을 담아라
		System.out.println(numbers[0]); 
		
		for(int i = 0; i < strArray.length; i++) { //strArray 의 크기만큼 반복해준다.
			System.out.println(strArray[i]); //null이 주소값이다. 
		}
		
		
		
	}

}
