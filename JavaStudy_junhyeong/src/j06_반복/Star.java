package j06_반복;

public class Star {

	public static void main(String[] args) {
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 */
		
		
		
		for(int i = 0; i < 5; i++) { // 전체 5회 반복
			for(int j = 0; j < i + 1; j++) { // 별 찍기 5회반복, i 가 0부터 시작하기 때문에 + 1 시작
			System.out.print("*");
			}
			System.out.println();	// 별 한번 찍고, 띄워써주기 
		}
		System.out.println("===================================");
		
		for(int i = 0; i < 5; i++) { // 전체 5회 반복
			for(int j = 0; j < 5 - i; j++) { //별 찍기 5회 반복, i 가 역순이기 때문에 5를 빼줌
				System.out.print("*");
			}
			System.out.println(); // 별 한번찍고, 띄워써주기
		}

		System.out.println("===================================");
		
		for(int i = 0; i < 5; i++) {// 전체 5회 반복
			for(int j = 0; j < 4 - i; j++) { // 빈칸을 4 3 2 1 로 출력
				System.out.print(" ");
				}
			for(int j = 0; j < i + 1; j++) {//별을 1 2 3 4 5 로 출력
				System.out.print("*");
				}
			System.out.println();//한줄 띄우기
		}
		
		System.out.println("===================================");
		
		for(int i = 0; i < 5; i++) {// 전체 5회 반복
			for(int j = 0; j < i; j++) { //i 가 0 1 2 3 4 로 증가하는 만큼 빈칸이 증가하기 때문에 i를 크기로 줌
				System.out.print(" ");
			}
			for(int j = 0; j < 5 - i; j++) { // *의 개수가 5 4 3 2 1 이기 때문에 5 - i를 해준다.
				System.out.print("*");
			}
			System.out.println();//한줄 띄우기
		}
		
		System.out.println("===================================");
		
		for(int i = 0; i < 5; i++) { //전체 5회 반복
			for(int j = 0; j < 4 - i; j++) { // 공백 4 3 2 1 출력
				System.out.print(" ");// 공백 출력
			}
			for(int j = 0; j < (i + 1) + i; j++) {
				System.out.print("*"); //별 출력 1 3 5 7 9
			}
			System.out.println();//한줄 띄우기
		}
		 
		System.out.println("===================================");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (9 - i) - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
