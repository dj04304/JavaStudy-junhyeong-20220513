package j15_인터페이스;

public class SmartPhone {

	private final Hdmi hdmi; //인터페이스, final -> 상수 선언을 하고 초기화를 무조건 해줘야 한다.
							//즉 값이 무조건 주입이 돼야하기 때문에 생성되는 시기에 값을 주입해준다.
							//상수이기 때문에 한번 선언하면 값이 변하지않는다. 그래서 getter는 사용이 가능해도 setter는 사용이 불가능하다.
	
	public SmartPhone(Hdmi hdmi) { //생성할 때 부속을 바꿔 준다.
		this.hdmi = hdmi;
	}
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdmi.connect();
		
	}
	
	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdmi.disconnect();
	}
	
	
}
