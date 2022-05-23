package j08_클래스;
/**
 * 
 * 1. Car 클래스를 만든다.
 * 2. Car 클래스의 속성(변수) 제조사(company), 모델(model), 색상(color)
 * 3. Car 클래스의 기능(메소드) 
 * showCompanyInfo() -> 000회사에서 제조된 차량입니다.
 * showInfoAll() -> 
 * 제조사: KIA
 * 모델: K5
 * 색상: 화이트
 * getCar() -> return "KIA_K5_화이트";	
 * setColor() -> 매개변수에 색상을 받아서 color변수의 값을 변경할 수 있게끔
 * 
 * 차량 3대 만들기
 * KIA, k7, 블랙- setColor(블루)
 * 현대자동차, 소나타, 화이트-setColor(그레이)
 * Tesla, Model3, 레드-setColor(그린)
 */

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.company = "KIA";
		car.model = "K7";
		car.color = "블랙";
		car.showCompanyInfo();
		car.showInfoAll();

		
		System.out.println("====================================");
		Car car2 = new Car();
		
		car2.company = "현대자동차";
		car2.model = "소나타";
		car2.color = "화이트";
		
		car2.showCompanyInfo();
		car2.showInfoAll();
		
		System.out.println("====================================");
		
		Car car3 = new Car();
		
		car3.company = "Tesla";
		car3.model = "Model3";
		car3.color = "레드";
		
		car3.showCompanyInfo();
		car3.showInfoAll();
		
		System.out.println("====================================");
		
		System.out.println(car.getCar());
		System.out.println(car2.getCar());
		System.out.println(car3.getCar());
		
		System.out.println("====================================");
		
		car.setColor("블루");
		car2.setColor("그레이");
		car3.setColor("그린");
		
		
		car.showInfoAll();
		System.out.println("====================================");
		car2.showInfoAll();
		System.out.println("====================================");
		car3.showInfoAll();
		
	}

}
