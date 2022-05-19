package j06_반복;

public class While03 {

	public static void main(String[] args) {
		//전체 구구단
		int dan = 0;
		int num = 0;
		int result = 0;
		
		System.out.println("구구단");
		System.out.println();
		while(dan < 8) {
			dan += 2;
			System.out.println(dan + "단");
			System.out.println();
			num = 0;
			while(num < 10) {
				result = dan * (num + 1);
				System.out.println(dan + " X " + num + " = " + result);
				num++;
			}
			dan -= 1;
		}
	}

}
