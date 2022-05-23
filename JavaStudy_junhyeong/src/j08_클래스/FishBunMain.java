package j08_클래스;

public class FishBunMain {
	
	public static void main(String[] args) {
		FishBun fishBun = new FishBun(); //FishBun(); 호출, 객체 생성, 생성자
		
		
		
		fishBun.showInfo(); //값이 없어서 재료 ,  반죽이 각각 null 이 뜸
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽"; // 재료, 반죽에 값을 넣음
		fishBun.showInfo(); // 팥 , 부드러운반죽이 출력
	
		System.out.println("=================================");
		FishBun fishBun2 = new FishBun(); //FishBun(); 호출, 객체 생성, 생성자
		
		fishBun2.showInfo(); 
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo(); // 슈크림 , 퍽퍽한 반죽이 출력
		System.out.println("=================================");
		fishBun.showInfo(); // 위에서 넣어둔 팥, 부드러운 반죽이 그대로 출력

		
		FishBun fishBun3 = new FishBun(); // new FishBun()의 반환은 메모리이다.
		
		System.out.println(fishBun); // fishBun의 주소 
		System.out.println(fishBun2); // fishBun2의 주소 
	}

}
