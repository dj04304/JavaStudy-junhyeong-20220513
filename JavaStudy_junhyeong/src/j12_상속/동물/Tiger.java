package j12_상속.동물;

public class Tiger extends Animal{ //Animal을 상속
	
	@Override 
	public void move() {
		//super.move(); // 상위 클래스 내에 있는 메소드 move()를 호출
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
		
}
