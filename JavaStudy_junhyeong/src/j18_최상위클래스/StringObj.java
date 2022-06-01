package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name = "김준일";
		String name2 = "김준일";
		
		System.out.println(name == name2);// true String = "" 의 값 자체가 주소(리터럴 값)이다.
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름1: ");
		name = scanner.nextLine();
		System.out.print("이름2: ");
		name2 =scanner.nextLine();
		System.out.println(name == name2);// false 생성(new)되었기 때문에 주소값이 다르다.

		name = new String("김준일");
		name2 = new String("김준일");
		
		System.out.println(name == name2);// false 생성(new)되었기 때문에 주소값이 다르다.
		System.out.println(name.equals(name2)); //안에 들어있는 값을 비교
		
	}

}
