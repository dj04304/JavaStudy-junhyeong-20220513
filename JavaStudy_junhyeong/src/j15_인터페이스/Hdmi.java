package j15_인터페이스;

/*
 * 인터페이스(interface)
 * 약속
 * 클래스와 클래스를 연결할 때 인터페이스는 같아야 한다.
 * 
 * 1. 기본적으로 모든 메소드는 추상 메소드이다.
 * 2. 일반 메소드를 사용하고 싶다면 return type 앞에 default 키워드를 사용하여야 한다.
 * 인터페이스는 오버라이딩을 강제하는데, 인터페이스는 상속도 안되고, private는 접근할 수 없기 때문에 사용하지 않는다.
 *
 */

public interface Hdmi {
	public void connect();
	
	public void disconnect();
	
}
