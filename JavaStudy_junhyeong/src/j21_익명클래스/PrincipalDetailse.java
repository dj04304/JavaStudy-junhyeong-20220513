package j21_익명클래스;

import java.util.ArrayList;
/*
 * 인터페이스와 추상메소드는 생성이 불가능하다.
 * 그래서 다른 클래스에 implements를 해주고, 오버라이드 하여 클래스를 생성해서 사용해야 한다.
 * 하지만 아래처럼 클래스 없이 바로 구현을 하는 경우도 있는데, 이 때 클래스명이 따로 정해져 있지 않기 때문에
 * 이를 익명클래스라고 한다.
 * 
 * 사용법: 한번 사용할 때는 괜찮지만, 여러번 사용하면 사용할 때 마다 구현을 해줘야 하기 때문에 복잡해진다.
 * 그래서 구현 내용이 달라질 때, 사용해준다.
 */
import java.util.Collection;
import java.util.List;

public class PrincipalDetailse {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		GrantedAuthority grantedAuthority = new GrantedAuthority() {
			
			@Override //여기서는 출력을 원하고
			public Collection<String> getRoles(List<String> roles) { //List 를 return해줌
				System.out.println(roles);
				return roles;
			}
		};
		
		
		GrantedAuthority grantedAuthority3 = new GrantedAuthority() {
			
			@Override //여기서는 출력을 원하지 않는다.
			public Collection<String> getRoles(List<String> roles) {
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority2 = new GrantedAuthorityImpl();
		
		//List를 return해주기때문에 getRoles(strList)가 가능하고, 이는 컬렉션이기 때문에 람다식도 가능하다.
		grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);}); 
		grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});
		
	}

}
