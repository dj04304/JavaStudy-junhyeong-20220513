package j18_최상위클래스;



public class Main {

	public static void main(String[] args) {	
//		Object obj = t1; //업캐스팅 가능(Object로 상속 또는 구현이 되었다.)
//		
////		String str = t1; // 오류
//	}
//
//	public void test(Object obj) {
//		System.out.println(obj.toString());
//		if(obj instanceof Teacher) { //obj 가 Teacher로 생성되었다면
//			Teacher teacher = (Teacher) obj; //obj를 다운캐스팅
//		}
		Teacher t1 = new Teacher("김준일", "웹개발");
		Teacher t2 = new Teacher("김준일", "웹개발");
		
		System.out.println(t1.toString()); //toString 은 생략이 가능하다.
		System.out.println(t2);
		System.out.println(t1 == t2);// == 는 안의 값을 비교하는 것이 아닌 주소값을 비교하는 것이다. 그렇기에 내용이 같아도 false값이 뜨는 것이다.
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode() == t2.hashCode());// hashCode를 이용해서도 비교할 수 있다.
		
		
	}
	
}
