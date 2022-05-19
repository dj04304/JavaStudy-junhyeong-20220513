package j06_반복;

public class While01 {

	public static void main(String[] args) {
			int i  = 0;
			int result = 0;
			
//			i = i + 1;
//			result = result + i; 
//			System.out.println(result); // 100번 반복하면 1~100까지 더하는 수가 된다.
			
			while(i < 100) { // 100회 반복 참일 때, 반복하며 거짓일때는 반복하지 않는다.
				//i = i + 1; // i += 1; , ++i; 또는 i++; 전자는 횟수를 정할 수 있지만, 후자는 1씩만 증가 가능하다. 
				result = result + (i + 1);
				i++; //조건 변화 수식
			}

			System.out.println(result);
	}

}
