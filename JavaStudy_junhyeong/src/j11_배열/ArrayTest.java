package j11_배열;

public class ArrayTest {

	public static void main(String[] args) {
		
		/*
		 * 8의 배수의 크기만큼을 구해서 8의 배수를 담아 출력
		 */
		
		int size = 0; //size를 담을 변수를 지정
		
		//8의 배수 size를 구하는 반복문
		for(int i = 0; i < 100; i++) { // 100번 반복하는 반복문
			if(i != 0 && i % 8 == 0) { // 0을 제외한 8의 배수
				size++; //i 가 0을 제외한 8의 배수일 때, size는 1씩 증가한다. 
			}
		}
		int[] numArray = new int[size]; //0~ 100 사이 0을 제외한 8의 배수의 크기를 생성
		
		//8의 배수를 담고 출력하는 반복문
		for(int i = 0, j = 0; i < 100; i++) { // 0 ~ 100사이 반복하는 반복문
			
			if(i != 0 && i % 8 == 0) { // i 가 0이아닌 8의 배수일때
				numArray[j] = i; // numArray에 i가 8의 배수가 될 때마다 1씩 증가하면서 배열에 담는다.
				System.out.println(numArray[j]);//출력
				j++;
			}
		}
		
		
	}

}
