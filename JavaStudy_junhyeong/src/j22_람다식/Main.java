package j22_람다식;

public class Main {

	public static void main(String[] args) {
		Math<Integer, Integer> plusLamda = (v1, v2) -> v1 + v2; //생성 부분;
		System.out.println(plusLamda.calc(10, 20));
		
		Math<Integer, Double> plusLamda2 = (v1, v2) -> {
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			return v1 + v2;};
			
		System.out.println(plusLamda2.calc(30, 40.5));

	}

}
