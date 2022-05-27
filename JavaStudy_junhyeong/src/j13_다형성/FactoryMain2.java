package j13_다형성;
/*
 * 
 */
public class FactoryMain2 {

	public static void main(String[] args) {
		//배열로 묶어두면 반복을 할 수 있고, 이는 한번의 클릭으로 모든 공장을 시작해줄 수 있다.
		Factory[] factorys = new Factory[100];
		
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory(); // 배열로 묶어주면 반복이 가능하다.
	
		for(int i = 0; i < factorys.length; i++) { //factorys의 크기만큼 반복
			// SmartPhoneFactory 실행 , ComputerFactory 실행
			//factorys[i].start(); 
			
			//i 가 짝수이면 SmartPhoneFactory 생성, 홀수이면 ComputerFactory 생성
			//삼항연산자, 조건연산자
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		//foreach문 
		for(Factory factory : factorys) { //factorys 배열을 factory에 담아 실행
			factory.start();
		}
	
//		다운캐스팅
//		int i = 10;
//		double d = i;
//		int ii = (int) d;
		
		System.out.println();
		//SmartPhoneFactory -> Factory 업캐스팅해준걸 다시 SmartPhoneFactory로 다운캐스팅 해줌
		// 단,SmartPhoneFactory를 컴퓨터 팩토리로는 바꿀 수 없다.
		for(Factory factory : factorys) {
			// factory의 생성이 SmartPhoneFactory이라면 true가 나옴 아니면 false
			if(factory instanceof SmartPhoneFactory) { 
				SmartPhoneFactory spf = (SmartPhoneFactory) factory; //SmartPhoneFactory 로 다운캐스팅
				spf.showsmartPhone(); //다운캐스팅 이후 메소드 호출
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory; // ComputerFactory 로 다운캐스팅
				cf.showComputer(); //다운캐스팅 이후 메소드 호출
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
	
		}
	
		
	}

}
