package j07_메소드;

//메소드 오버로딩

public class Method03 {

	
	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int자료형 매개변수가 한개 test1 호출");
	}
	
	public static void test1(int num, int num2) {
		System.out.println("int자료형 매개변수가 두개인 test1 호출");
	}
	
//	public static void test1(int a) { // 위 int num 과 매개변수의 개수가 같기 때문에 오류
//		System.out.println("int자료형 매개변수가 한개인 test1 호출");
//	}
	
	public static void test1(double a) {
		System.out.println("double자료형 매개변수가 한개 test1 호출");
	}
	
	public static void test1(int num, double dNum) {
		System.out.println("int자료형 다음에 double 자료형 매개변수가 두개인 test1 호출");
	}
	
	public static void test1(double dNum, int num) {
		System.out.println("(자리를 바꾼) double 자료형  다음에 int자료형 매개변수가 두개인 test1 호출");
	}
	
	public static void main(String[] args) {
		//똑같은 이름의 메소드를 사용하지만, 매개변수를 줌으로써 구분해줄 수 있다.
		// 단, 매개변수가 하나여도 자료형이 다르면 가능하지만, 같은 자료형일 경우에는 오류가 난다.
		test1(); 
		test1(10);
		test1(10,20);
		test1(3.14);
		test1(10, 3.14);
		test1(3.14, 10);
		// 호출하는 것이 중요하지, 호출하는 자료형은 크게 중요하지 않다.
	}

}
