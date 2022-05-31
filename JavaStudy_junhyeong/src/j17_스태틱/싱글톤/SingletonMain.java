package j17_스태틱.싱글톤;

import j07_메소드.Method02;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		 * 싱글톤
		 * 
		 * 1.유일한 객체(인스턴스)를 생성해야 한다.(private 사용)
		 * 2.생성자는 private이어야 한다.
		 * 3.getInstance가 존재해야 하는데, instance를 return 해준다.
		 * 
		 */
		
		Method02.test1();
		
		 //생성된 instance / private으로 묶여있어서 가져올 수 없기 때문에 static으로 가져온다.
		Singleton singleton = Singleton.getInstance(); //Singleton 생성
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();//Singleton 생성
		singleton2.setCount(20);
		singleton2.printInfo();
	}

}
