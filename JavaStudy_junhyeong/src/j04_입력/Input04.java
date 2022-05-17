package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String summary = null;
		String director = null;
		String rank = null;
		String audience = null;
		String detail = null;
		String detail2 = null;
		
		
		System.out.print("개요: ");
		summary = scanner.nextLine();
		System.out.print("감독: ");
		director = scanner.nextLine();
		System.out.print("등급: ");
		rank = scanner.nextLine();
		System.out.print("흥행: ");
		audience = scanner.nextLine();
		System.out.print("줄거리: ");
		detail = scanner.nextLine();
		System.out.print("줄거리2: ");
		detail2 = scanner.nextLine();
		
		System.out.println("개요: " + summary);
		System.out.println("감독: " + director);
		System.out.println("등급: " + rank);
		System.out.println("흥행: " + audience);
		System.out.println("줄거리: " + detail);
		System.out.println("줄거리2: " + detail2);
		
	}

}
