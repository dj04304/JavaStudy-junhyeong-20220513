package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {

		for(int dan = 0; dan < 8; dan++) { //dan 을 9회 반복 
			 // dan은 2부터 시작이기 때문에 2로 시작
			System.out.println((dan +2) + "단");
			for(int num = 0; num < 9; num++) {
				int result =(dan + 2) * (num +1); 
				System.out.println((dan +2) + " X " + (num + 1) + " = " + result);
			}
			System.out.println();
		}
		
	}

}
