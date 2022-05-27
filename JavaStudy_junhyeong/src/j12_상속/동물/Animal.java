package j12_상속.동물;

public class Animal {
	//하위 클래스에서 재정의해서 사용하는 메소드인데 굳이 있는 이유?
	//이는 다형성 때문이다.
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
