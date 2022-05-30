package j14_추상;

public class FactoryMain {

	public static void main(String[] args) {
			Factory samsung = new SamsungFactory(); // 업 캐스팅
			Factory lg = new LGFactory();
			
			//Fatory 클래스를 상속받은 모든 클래스(인스턴스) 를 담을 수 있는 공간 2개의 배열 생성
			Factory[] factorys = new Factory[2];
			
			factorys[0] = new SamsungFactory(); // 1번 자리에 업캐스팅된 SamsungFactory
			factorys[1] = new LGFactory(); // 2번 자리에 업캐스팅된 LGFactory
			
			for(Factory factory : factorys) { //foreach 반복의 특징: 처음부터 끝까지 반복
				factory.start();
			}
			
			for(Factory factory : factorys) {
				factory.stop();
			}
			
	}

}
