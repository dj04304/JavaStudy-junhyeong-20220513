package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		Monitor monitor = new Monitor(); //모니터 생성
		BeamProjector beamProjector = new BeamProjector(); //빔 프로젝트 생성
		
		SmartPhone smartPhone = new SmartPhone(monitor); //업 캐스팅 new SmartPhone(Hdmi) 이기 때문에 상속받은 beamProjector가 업캐스팅 된 것이다.
		smartPhone.powerOn();
		smartPhone.powerOff();
//		Hdmi hdmi = new Hdmi(); //인터페이스도 추상메소드처럼 생성이 불가하다.
	}

}
