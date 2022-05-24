package j09_접근지정자.a;

import j09_접근지정자.b.Test2;

public class TestMain {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.aaa = "안녕";
		
		new Test2();

		Test2 t2 = new Test2();
		t2.ccc = " ";

	}

}
