package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[시험 성적]");
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요: ");
		
		score = scanner.nextInt();
		
		if(score < 0 || score > 100 ) {
			System.out.println("계산할 수 없는 점수입니다.");
		}else if(score > 89) {
			grade = 'A';
		}else if(score > 79) {
			grade = 'B';
		}else if(score > 69) {
			grade = 'C';
		}else if(score > 59) {
			grade = 'D';
		}else {
			grade = 'F';
		}
			
		System.out.println("성적은 " + score + "이며 학점은 " + grade + "학점입니다.");
		
	}		
}

