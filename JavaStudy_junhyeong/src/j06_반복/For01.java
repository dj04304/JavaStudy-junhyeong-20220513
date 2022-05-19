package j06_반복;
/**
 * 
 * while: 내 마음대로 자유롭게 반복할 때 사용한다.
 * for: 규칙적인 반복을 할 때 사용한다.
 *
 */
public class For01 {

	public static void main(String[] args) {
		
//		int i = 0;
//		while(i < 5) {	//아래쪽 for문과 값이 같음
//			System.out.println(i + 1);
//			i++;
//		}
		
		for(int i = 0; i < 5; i++) { //i = 0부터 시작, i 5회 반복  (선언; 조건; 조건변화수식)
			System.out.println(i + 1);// i + 1출력
		}//i증가
		
		for(int i = 0; i < 10; i++) { // i = 0부터 시작, i 10회반복, 후증가
			System.out.println(10 - i); // 10 - 0,1,2,3,4,... 출력
		}
		
	}

}
