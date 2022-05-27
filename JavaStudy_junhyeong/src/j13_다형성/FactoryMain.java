package j13_다형성;

public class FactoryMain {

	public static void main(String[] args) {
		Factory[] factorys = new Factory[5]; //5개의 배열을 생성
		
		//업캐스팅: 하위 클래스가 상위 클래스로 형 변환
		Factory smartPhoneFactory = new SmartPhoneFactory(); 
		Factory computerFactory = new ComputerFactory();
		
		smartPhoneFactory.start();
		computerFactory.start();
		
		
	}

}
