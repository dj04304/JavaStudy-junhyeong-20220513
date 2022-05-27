package j13_다형성;

public class ComputerFactory extends Factory {

	@Override 
	public void start() {
		System.out.println("컴퓨터 공장을 가동합니다.");
	}
	
	public void showComputer() { //메소드 생성
		System.out.println("컴퓨터들을 확인합니다.");
	}
	
}
