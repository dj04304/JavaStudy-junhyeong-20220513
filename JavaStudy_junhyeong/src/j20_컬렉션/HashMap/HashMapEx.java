package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

/*
 * HashMap
 * Key값은 중복될 수 없다. 하나라도 중복되면, 마지막 값이 덮어쓴다.
 * Value 값은 중복될 수 있다. 다만 순서는 없다.
 * 순서가 없고 값이 두 개이기 때문에, foreach구문을 사용할 수 없다.
 * 
 */

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();// Key 는 Integer, Value는 String 값을 넣는다.

		
		//값 추가 -> .put
		studentMap.put(20, "김준일");
		studentMap.put(10, "김준이");
		studentMap.put(22, "김준삼");
		studentMap.put(33, "김준사");
		studentMap.put(44, "김준오");
		
		System.out.println(studentMap); //마지막 값만 들어감 Why? => Key값이 중복될 수 없기 때문이다.
		
		//Key값으로 Value값 가져오기 -> .get(Key값) 
		System.out.println(studentMap.get(10));// 10번 "Key값"에 들어있는 것을 가져와라
		
		
		//값 수정
		//put을 쓴다면, 값이 없을 때 값이 추가되어버린다. 하지만 replace를 쓴다면 내가 원하는 값을 수정하고, 없다면 수정하지 않는다.
		studentMap.put(10, "김준육"); 
		studentMap.replace(10, "김준칠");
		
		//값 제거
		studentMap.remove(10);
		
		//원하는 값 불러오기.
		Iterator<Integer> iterator = studentMap.keySet().iterator(); //keySet을 하면 set값으로 바꿔준다.
		while(iterator.hasNext()) { //다음 값이 있으면 반복
			Integer key = iterator.next();
			String value = studentMap.get(key);
			if(value.equals("김준오")) {
				System.out.println(studentMap.get(key));
			}
			System.out.println(value);
		}
		
		
		
		//원하는 값 불러오기 2 -> 람다식(함수형 프로그래밍)
		// 함수명이 없기 때문에 익명함수라고 한다.
		studentMap.forEach(
			(k, v) -> { //k 에 key값을 가져오고, 가져온 값의 value를 v에 넣어 가져오는것을 반복한다.
				System.out.println("key: " + k);
				System.out.println("value" + v);
			}
		);
		
		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsValue("김준구"));
		
	}

}
