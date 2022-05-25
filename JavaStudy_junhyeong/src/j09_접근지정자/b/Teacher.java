package j09_접근지정자.b;

public class Teacher {
	//정보은닉: 외부로 정보가 새어나가지 않게 private 해주는 것
	private String name;
	private String address;
	private String phone;
	
	//getter setter 생성 Alt + Shift + s
	//getter setter 는 값을 받아와서 내보내줘야 하기 때문에 public 을 쓴다.
	public String getName() {//2.getName으로 return해준다.
		return name;
	}
	public void setName(String name) { //1. setName으로 이름을 받아오고
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//캡슐화 : 내부에서 캡슐로 보호해주는 것. 정보은닉을 활용해서 캡슐화를 하는 것.
	public void showInfo() {
		String _address = createMassege(name, address);
		String _phone = createMassege(name, phone);
		
		System.out.println(_address);
		System.out.println(_phone);
	}
	  
	private String createMassege(String name, String value) { //name 님: ~ 를 따로 빼준다.
		
		return name + "님: " + value;
		
	}
	
	
}
