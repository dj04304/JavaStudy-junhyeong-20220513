package j23_예외처리;

public class Throws01Main {
		//여기서도 예외를 미룰 수 있다.
	public void test() throws Exception {
		Throws01 throws01 = new Throws01();
		
		 	//미룬 예외를 try catch를 추가해 여기서 처리해준다.
			throws01.printArray(new int[] {1,2,3,4,5,6,7,8,9});
		
		
	}
		//여기서도 예외를 미룰 수 있다. 다만 main에서는 안미루는것이 좋다.
	public static void main(String[] args){
		
		Throws01Main main = new Throws01Main();
		
		try {
			main.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
		
	}
	
}

