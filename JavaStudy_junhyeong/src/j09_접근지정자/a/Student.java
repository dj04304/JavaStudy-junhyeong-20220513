package j09_접근지정자.a;

public class Student {
	private String name;
	private String schoolName;
	
	
	//setter
	public void setName(String name) { //값을 넣어줘야 하기 때문에 자료형이 같아야 한다.
		this.name = name;
	}
	
	//getter
	public String getName() { // 값을 가져오기만 하면 된다.(매개변수가 필요 없기 때문에 return만 해주면 됨)
		return name;
	}
	
}
