package j09_접근지정자.b;

import j09_접근지정자.a.Test1;

public class Test2 {
	public String ccc;
	String ddd; //기본값 default
	
	public Test2() {
		Test1 t1 = new Test1();
	}
//	Test2(){ 기본값은 public 이지만, 생성하는 순간 default값으로 잡힘
//		
//	}
	
}
