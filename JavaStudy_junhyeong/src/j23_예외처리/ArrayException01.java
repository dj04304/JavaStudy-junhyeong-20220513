package j23_예외처리;

/*
 * 우리는 원하는 식이 있는데, 문제가 있어서 Exception이 뜬다. 
 * 이때 식을 건드리는 것이 아닌, Exception을 해결해주는 것이 예외처리이다.
 * Exception이 실행되면, 그 밑에 있는 식들은 출력되지 않는다. 그러면 지금까지 입력했던 것들이 다 날아가기 때문에 필수적으로 해줘야 하는 요소이다.
 * 이는 try catch로 해준다.
 * 그리고 유지보수를 위해서라도 Exception은 필요하다.
 * 
 * 
 * 프로그램의 오류
 * 1. 예외(프로그램이 실행 중) RuntimeException
 * 2. 컴파일 에러 -> ex) 드라이버 IOException
 * 3. 버그
 */

public class ArrayException01 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		//try catch: 오류가 날 법한 부분을 묶어줘서 예외를 처리해준다.
		try {
			for(int i = 0; i < numbers.length + 1; i++) {
				System.out.println("index" + i + ": " + numbers[i]);
			}
		}catch (StringIndexOutOfBoundsException e) { //StringIndexOutOfBoundsException 을 함께 처리하기 위해 상위 클래스인 IndexOutOfBoundsException 를 써준다.
												//마치 업캐스팅 개념과 비슷하다.
			System.out.println(e); //Throwable(예외의 최상위) 에 있는 메세지가 출력된다.
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		}catch(Exception e) { //Exception 은 항상 밑에 있어야한다. 디테일한 처리를 해야하는데, 가장 앞에있으면 여기서 다 걸리기 때문이다. 
			System.out.println(e);
		}
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
	}

}
