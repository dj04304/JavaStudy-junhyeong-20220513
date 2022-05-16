package j03_연산;

public class Operation01 {

	public static void main(String[] args) {
		int num = 10;
//		++num;
		num = num + 1;
//		System.out.println(++num); : 12 선증가
		System.out.println(num++); // 후증가 11
		System.out.println(num); // 증가한 값 12

		System.out.println(--num); // 선 감소 11
		System.out.println(num--);// 후 감소 11
		System.out.println(num); // 감소한 값 10
	}

}
