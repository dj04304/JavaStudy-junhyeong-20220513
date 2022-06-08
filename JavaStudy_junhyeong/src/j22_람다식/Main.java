package j22_람다식;

public class Main {

	public static void main(String[] args) {
		
		Math2 m2_1 = new Math2Impl(); //implements를 이용한 생성
		Math2 m2_2 = new Math2() { //익명클래스로 새성
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}
		};
		//람다식
		// 결과가 return 밖에 없을 때, 중괄호({}) 생략 중괄호는 메소드가 아닌 body부분이다.
		// 즉, 중괄호를 여는 순간 return을 해줘야한다.
		Math2 m2_3 = (v1, v2) -> v1 / v2;
		
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			return v1 % v2;
		};
		
		double t = m2_3.calc(10, 3);
		System.out.println(t);
	}

}
