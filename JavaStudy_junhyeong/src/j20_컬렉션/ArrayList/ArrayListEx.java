package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		String[] strArray = new String[5]; // 5개 공간의 배열을 만듦
		
		strArray[0] = "a";
		strArray[1] = "a";
		strArray[2] = "a";
		strArray[3] = "a";
		strArray[4] = "a";

		strArray[2] = null; //2번을 null로 만든다.
		
		for(String str : strArray) { //foreach를 이용한 배열의 반복
			System.out.println(str);
			
		}
		
		System.out.println();
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]); //index값을 가져온다.
		}
		
		System.out.println();
		ArrayList<String> strArrayList = new ArrayList<String>(); //ArrayList 생성 , 공간을 늘리지 않아도 알아서 유동적으로 공간이 늘어난다.
		//순서대로 들어간다.
		strArrayList.add("b1"); //strArrayList 에 "b"추가
		strArrayList.add("b2"); //strArrayList 에 "b"추가
		strArrayList.add("b3"); //strArrayList 에 "b"추가
		strArrayList.add("b4"); //strArrayList 에 "b"추가
		strArrayList.add("b5"); //strArrayList 에 "b"추가
		strArrayList.add("b6"); //strArrayList 에 "b"추가
		
		System.out.println(strArrayList.size());
		
		for(String str :strArrayList) {
			System.out.println(str);
		}
		
		System.out.println();
		
		strArrayList.remove("b1"); //b1 값을 지움
		strArrayList.remove(0); // b2 값을 지움 (b1이 지워졌기 때문에 b2가 0번 index가 된다.)
		
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(strArrayList.get(i)); //ArrayList의 값을 가져올때는 get으로 가져온다.
		}
		
		System.out.println("람다 표현식");
		strArrayList.forEach(r -> {System.out.println(r);});
		
	}

}
