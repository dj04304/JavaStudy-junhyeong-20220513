package j17_스태틱.싱글톤;

/**
 * 
 * 싱글톤
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야 한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는 
 * 		getInstance() static 메소드가 존재해야 한다.
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static 변수가 존재해야 한다.
 *
 */

public class Singleton {
	//싱글톤 생성(변수명은 instance 고정이다.)
	private static Singleton instance = new Singleton();
	private int count;
	
	//기본생성자 생성
	private Singleton() {} // 무조건 private 이어야 한다. 유일한 객체여서 외부에서 누구도 생성해서는 안되기 때문이다.
	
	public static Singleton getInstance() { //스태틱이기 때문에 생성하지 않아도 사용이 가능하다. 
		if(instance == null) { //만약 위에서 생성이 되지 않았다면(null) / 혹시나 생성되지 않을 수 있기 때문에 먼저 검사해주는 역할이다.
			instance = new Singleton(); // 여기서 다시 생성해준다.
		}
		return instance;
//		System.out.println(count); 스태틱 메소드는 일반 변수를 쓸 수 없다. 일반 변수와 메소드는 생성을 해야 쓸 수 있는 반면에 스태틱은 생성하지 않아도 쓸 수 있기 때문이다. 
	}
	
		
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트 -> " + count);
	}
}
