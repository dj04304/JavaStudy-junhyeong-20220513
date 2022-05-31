package j17_스태틱;

public class Main {

	public static void main(String[] args) {
		Test t = new Test(); //Test 생성
		Test t2 = new Test(); //Test 생성
		Test t3 = new Test(); //Test 생성
		
		
		t.count = 10;
		t2.count= 20;
		t3.count= 30;
		
		t.method();
		t2.method();
		t3.method();
		
		//스태틱은 생성이 되어도 복제는 안된다. 즉 생성은 되고 메모리는 존재하지만, 안에 텅 비어있다고 생각하면 된다.
		
//		StaticTest st = new StaticTest(); //StaticTest 생성
//		StaticTest st2 = new StaticTest(); //StaticTest 생성
//		StaticTest st3 = new StaticTest(); //StaticTest 생성
//		
//		
//		
//		//스태틱의 값은 공유가 된다.
//		st.count = 10;
//		st2.count= 20;
//		st3.count= 30;
//		
//		//StaticTest count 값을 100으로 바꿈, 데이터나 변수를 담는 주소가 고정된다.
//		StaticTest.count = 100;
//		
//		st.staticMethod();
//		st2.staticMethod();
//		st3.staticMethod();
		
		StaticTest.count = 50;
		
		//생성이 무의미함, 그래서 생성이 없어도 사용이 가능하다.
		StaticTest.staticMethod();
		
		
	}

}
