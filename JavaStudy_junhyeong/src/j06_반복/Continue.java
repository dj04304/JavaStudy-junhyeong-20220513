package j06_반복;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) { // i 10회 반복
			System.out.println(i); // i 출력
			if(i == 5) { 
				break;	 //i 가 5가되면 반복문 탈출			
			}
		}
		
		System.out.println("=================================================");
		
		for(int i = 0; i < 10; i++) { // i 10회 반복
			if(i % 2 == 0) { 
				continue;//다음 반복으로 넘어가라는 뜻	(5가 출력이 안됨)
				//System.out.println("오류입니다."); <- 어차피 continue 때문에 출력이 안돼서 오류가 남
			}
			System.out.println(i); // i 출력
		}
	
		
	}

}
