package j17_스태틱.싱글톤.factory;

public class KIA {
	
	//굳이 new로 생성을 안해주는 이유는 밑에 if문에서 null일때 생성해주기 때문이다.
	private static KIA instance;
	private int serial_Auto_increment = 20220000;
	
	private KIA() {}//싱글톤으로 만들거기 때문에 private사용
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(++serial_Auto_increment, KIA.class.getSimpleName(), model); //자동으로 증가, KIA클래스 이름 호출, model명은 매개변수로 받아옴
	}
	
	public void carInfo(Car car) {
		System.out.println(car.toString());
	}
}
