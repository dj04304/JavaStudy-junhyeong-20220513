package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {
	
	public Object createUser() { //타입이 Object
		return new CMRespDto<String>(1, "회원추가 성공", "aaaa, 1234"); //생성하는 타이밍이 제네릭을 이용해 자료형을 바꿔줄 수 있다.
		
	}
	
	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이)수정 성공", 29);
	}
	//제네릭의 와일드카드
	public CMRespDto<?> getUser() { //상황에 따라 자료형이 바뀔 수 있다. 그래서 우리는 와일드카드<?>를 사용하여 이를 해결할 수 있다.
		User user = new User(); //user생성
		user.setUsercode("1"); //user 의 메소드들을 호출
		user.setUsername("junhyeong");
		user.setPassword("1234");
		user.setName("박준형");
		user.setEmail("dj043045@gmail.com");
		if(user.getUsercode().equals("1")) {
			return new CMRespDto<User>(1, "회원정보 가져오기 성공", user);// 생성하면서 user의 값이 필요하기 때문에 제네릭 자료형을 User로 사용
		}else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
	}
	
	public CMRespDto<? extends Animal> getAnimal() { //Animal을 상속받은 친구들만 사용할 수 있음(상속으로 제약을 거는 방법)
		Animal animal = new Animal();
		if(animal instanceof Human) { //animal 내에 Human이 들어있다면
			return new CMRespDto<Human>(1, "사람입니다.",(Human) animal); //human으로 다운캐스팅 type Human
		}else if(animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "호랑이입니다.",(Tiger) animal); //tiger로 다운캐스팅 type Tiger	
		}else {
			return new CMRespDto<>(-1, "찾을 수 없는 동물입니다.", animal); //String은 Animal을 상속받지 않아서 오류가 나옴 >> (제네릭 부분을 비워주고 null을 넣어준다. nullPointException)
																			//비워준 곳은 뒤에 써준 자료형을 따라온다.
		}
	}
	
}
