package j23_예외처리;

public class ThrowEx {
	
	public static void main(String[] args) {
		try {
			System.out.println("프로그램 실행중...");
			int i = 1;
			
			if(i == 0) {
				throw new ValidationCustomException("예외 발생"); //예외를 강제로 실행해준다.
			}
			
		} catch (Exception e) { //여기서 예외를 처리해줌
			e.printStackTrace();
		}finally { // 무조건 실행이 되는 영역이다.
			System.out.println("무조건 실행");
		}
		
	}
	
}
