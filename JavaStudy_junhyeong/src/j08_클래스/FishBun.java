package j08_클래스;
 // 클래스는 메소드와 변수로 이루어져 있다.
 // 클래스는 참조 자료형이다.
 //아래 fishbun은 2개의 변수와 하나의 메소드로 이루어져 있다.

public class FishBun {
	String material; //재료
	String dough;
	
	FishBun(){ //메소드와의 차이 1. void 등 반환자료형이 없다. 2. 대문자이다.(메소드는 대문자X)
			//생성자
		
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
	
}
