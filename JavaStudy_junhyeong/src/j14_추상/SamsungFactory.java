package j14_추상;

public  class SamsungFactory extends Factory {

	@Override
	public void start() { //추상 메소드 오버라이딩
		System.out.println("삼성 공장 가동");
		
	}

	@Override
	public void stop() { //일반 메소드 오버라이딩
		System.out.println("삼성 공장을 멈춥니다.");
	}

}
