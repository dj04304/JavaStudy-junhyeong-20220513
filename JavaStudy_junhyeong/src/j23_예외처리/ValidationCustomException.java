package j23_예외처리;

public class ValidationCustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //객체의 구분을 위해 사용하는 거임.
	
	public ValidationCustomException() {
		super();
		System.out.println("우리가 만든 예외");
	}
	
	public ValidationCustomException(String message) {
		super(message);
		System.out.println("우리가 만든 예외 메세지 있음.");
	}

	
}
