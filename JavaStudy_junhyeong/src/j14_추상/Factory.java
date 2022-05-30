package j14_추상;

/* 
 * abstract(추상)
 * 
 * 공장에서의 start와 stop은 무조건적으로 필요하다. 하지만, samsungFactory, lgFactory에 이미 메소드가
 * 존재하기 때문에 공장이아닌 창고처럼 필요가 없어진다. 이를 해결해주는 방식이 바로 추상메소드이며
 * abstract이다.
 * 추상클래스는 설계도를 따르게 하기 위한 목적도 있다.
 * 
 * 	추상 메소드
 * 1. return type 앞에 abstract 키워드가 붙는다. (클래스의 형태가 추상 클래스 여야한다.)
 * 2. abstract 는 body(중괄호내용) 이 필요가 없다.
 * 3. 추상 메소드는 일반 클래스 안에 선언할 수 없다.
 * 4. 추상 클래스는 추상메소드 뿐만 아니라 일반 메소드도 가질 수 있다.
 * 5. 상속 또는 구현된 클래스에서 무조건 override(재정의)가 되어야한다.(추상 메소드 특성상 body가 없기 때문이다.)
 *
 * 	추상 클래스
 * 1. 클래스 type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 클래스는 생성 할 수 없다. (new 불가)
 * 3. 추상 메소드를 포함 할 수 있다. 하지만 추상 메소드를 꼭 포함하지 않아도 된다.
 * 
 */

//추상 클래스
public abstract class Factory {

	//추상 메소드
	public abstract void start();
	
	//일반 메소드
	public void stop() {
		System.out.println("공장을 멈춥니다.");
	}
	
	private void test() {
		
	}
	
	
}
