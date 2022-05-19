package j06_반복;

import java.util.Scanner;

public class While04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 반복횟수를 입력하세요: 5
		 * 
		 *  
		 *  
		 */
		
		int num = 0;
		int i = 0;
		
		System.out.print("반복횟수를 입력하세요: ");
		num = scanner.nextInt();
		
		while(i < num) { // num회 반복
			System.out.println(i + 1);
			i++;
		}
		
		i = 0;
		
		while(i < num) {//num 회 반복
			System.out.println(num - i); //20 19 18 17 이기 때문에 num에 순차적으로 빼줘야 함
			i++;
		}
	
	}
}
