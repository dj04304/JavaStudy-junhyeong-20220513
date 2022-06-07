package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = null;
		
		System.out.print("찾으실 값을 입력하세요: ");
		value = scanner.nextLine();
		
		/*
		 * 자동차 -> car
		 * 자전거 -> bicycle
		 * 기차 -> train
		 * 비행기 -> airplane
		 * 
		 * 지원하지 않는 단어입니다.
		 */
		
			if(value.equals("자동차")) { //문자열이기 때문에 == 이 아닌, .equals가 되어야 한다.
				System.out.println("car");
			}else if(value.equals("자전거")) {
				System.out.println("bicycle");
			}else if(value.equals("기차")) {
				System.out.println("train");
			}else if(value.equals("비행기")) {
				System.out.println("airplane");
			}else {
				System.out.println("지원하지 않는 단어입니다.");
			}

			
			//위 처럼 해주면, 값이 추가될 때 if else를 또 추가해줘야하지만, HashMap을 이용하면, 값만 put 해주면 된다.
			HashMap<String, String> words = new HashMap<String, String>();
			words.put("자동차", "car");
			words.put("자전거", "bicycle");
			words.put("기차", "train");
			words.put("비행기", "airplane");
			words.put("오토바이", "motocycle");
			words.put("버스", "bus");
			
			if(words.containsKey(value)) { //words내에 value 값이 포함되어 있다면,
				System.out.println(words.get(value)); // value값을 get해줘라.
			}else {
				System.out.println("지원하지 않는 단어입니다.");
			}
			
	}

}
