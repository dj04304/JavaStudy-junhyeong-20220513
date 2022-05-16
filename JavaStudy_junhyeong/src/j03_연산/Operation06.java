package j03_연산;

public class Operation06 {

	public static void main(String[] args) {
		int num = 80;
		
		String result = num % 4 == 0 ? "4의 배수" : "4의 배수가 아님";
		boolean result2 = num % 4 == 0 ? true : false;
		int result3 = num % 4 == 0 ? 1 : 0;
		
		System.out.println(result);
		System.out.println(result2);

	}

}
