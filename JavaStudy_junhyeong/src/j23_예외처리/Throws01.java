package j23_예외처리;

/*
 * throws
 * 호출하는 곳에 예외를 미루겠다 (강제성을 띄게 만듦) 
 * main까지 가서 미룰 수도 있다. 
 * 웬만해서는 다 넣어주는게 좋다.
 */

public class Throws01 {
	
	public void printArray(int[] arrays) throws Exception { 
		
		for(int i = 0; i < arrays.length + 1; i++) {
			System.out.println("index" + i + ": " + arrays[i]);
		}
	
	}
}
