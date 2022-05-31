package j17_스태틱.싱글톤.factory;

public class Main {

	public static void main(String[] args) {
		KIA kiaFactory1 = KIA.getInstance(); //KIA 생성
		KIA kiaFactory2 = KIA.getInstance(); //KIA 생성
		KIA kiaFactory3 = KIA.getInstance(); //KIA 생성

		
		
		Car k5_01 = kiaFactory1.createCar("k5"); //k5 01 createCar
		Car k5_02 = kiaFactory1.createCar("k5"); //k5 02 createCar
		
		kiaFactory1.carInfo(k5_01); // carInfo(toString 호출)
		kiaFactory1.carInfo(k5_02); // carInfo(toString 호출)
		
		Car k7_01 = kiaFactory2.createCar("k7"); //k7 01 createCar
		Car k7_02 = kiaFactory2.createCar("k7"); //k7 02 createCar
		
		kiaFactory1.carInfo(k7_01);
		kiaFactory1.carInfo(k7_02);
		
	}

}
