package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		//순서가 없으며 중복을 허용하지 않는다.
		HashSet<String> name = new HashSet<String>();
		
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");
		
		System.out.println(name);
		
		//set 값을 불러오는 방법 -> Iterator<> 생성 = 변수.iterator()
		
		Iterator<String> iterator = name.iterator();
		
		//반복문을 이용해 iterator.hasNext() 를 while내에 넣어서 하나씩 들고온다.
		while(iterator.hasNext()) { // iterator 내에 다음 값이 있으면 true를 return, 다음 값이 없으면 false 를 return
			String name2 = iterator.next(); //iterator.next()는 변수에 담아서 사용해줘야한다.
			if(name2.equals("김준이")) {
				System.out.println(name2);
			}
		}
		
		//값을 삭제 -> remove (순서가 없기 때문에 값을 바로 넣어준다.)
		name.remove("김준사");
		System.out.println(name);
		
		//Set은 값을 수정하는 것이 불가능하다. 순서도 없고, 기준도 없고 그 자체로 값이기 때문에 불가능하다. 그래서 remove 하고 add해주는게 수정이다.
		
		name.add("김준");
		System.out.println(name);
		
	}

}
