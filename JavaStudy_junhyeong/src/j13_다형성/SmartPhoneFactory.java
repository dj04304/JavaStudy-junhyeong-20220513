package j13_다형성;

public class SmartPhoneFactory extends Factory {
	
	@Override 
	public void start() {
		System.out.println("스마트폰 공장을 가동합니다."); //재정의
	}
	
	public void showsmartPhone() { //메소드 생성
		System.out.println("스마트 폰들을 확인합니다.");
	}
	
}
