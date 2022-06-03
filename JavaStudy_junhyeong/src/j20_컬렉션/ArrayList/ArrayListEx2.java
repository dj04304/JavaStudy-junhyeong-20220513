package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>(); //순서가 있고, 중복을 허용한다.
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		//리스트에 값 추가 -> add()
		nameList.add("김준일");//제네릭 타입이기 때문에 String 만 가능
		nameList.add("곽나경");
		nameList.add("김서홍");
		nameList.add("최보성");
		nameList.add("박준형");
		nameList.add("강주현");
		nameList.add("유재원");
		
		//리스트 중간에 값 삽입 -> add(index 번호, )
		nameList.add(0, "이동영");
		
		//리스트 내의 해당 인덱스 값 수정 => set(index 번호, )
		nameList.set(1, "정유진");
		
		//리스트 내에서 인덱스로 값 삭제 -> remove(index 번호)
		nameList.remove(3); //"김서홍"님 값 삭제
		
		//리스트 내에서 값을 바로 삭제
		nameList.remove("강주현"); //"강주현"님 값 삭제
		
		//리스트에서 리스트로 값 옮기기(깊은복사) -> addAll()
		//얕은 복사와 깊은 복사 얕은복사는 주소를 공유하지만 깊은 복사는 주소 공유 x 내용을 통째로 옮기는 행위다.
		nameList2.addAll(nameList);

//		nameList2.removeAll(nameList); //nameList2와 nameList가 중복되는 내용을 삭제
		
		//리스트 내의 모든 값 확인 -> toString()
		System.out.println(nameList);
		
		//리스트에서 값 가져오기 -> get(index 번호)
		System.out.println(nameList.get(3));
		
		//리스트 내에서 원하는 값이 있는지 확인 -> contains()
		System.out.println(nameList.contains("김준일")); //false
		System.out.println(nameList.contains("이동영")); //trues
		
		//리스트 내에 값이 하나라도 있으면 비우기
		
		if(!nameList.isEmpty()) { //isEmpty()는 비어있으면 true이기 때문에 앞에 !(not)을 붙여 비어있지 않으면 을 전제로 해준다.
			nameList.clear(); // 리스트 내에 모두 비우기 -> clear()
		}
		System.out.println(nameList);
		System.out.println(nameList2);
		
		//리스트를 배열로 변환, Object 배열을 써줘야한다.
		Object[] objs = nameList2.toArray();
		
		//다운캐스팅으로 가져옴
		for(Object obj : objs) {
			System.out.println((String) obj);
		}
		
		
		
		
	}

}
