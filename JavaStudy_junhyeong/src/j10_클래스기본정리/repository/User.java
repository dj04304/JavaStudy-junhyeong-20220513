package j10_클래스기본정리.repository;

/**
 * 
 * Entity(독립체) Class
 * 
 * 정보를 담는 객체를 Entity 객체라고한다.
 * 수백만의 데이터를 찍어낼 수 있는 틀을 말한다.
 *
 */


public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본생성자
	//전체생성자
	//getter
	//setter
	//toString
	
	//기본생성자
	public User() {} //굳이 생략되어있는 기본생성자를 만들어 준 이유
						//: 전체생성자를 생성했을 때, 효력을 잃기 때문에 만들어 줘야 한다. 
	
	//전체생성자
	//생성자 오버로딩
	public User(String usercode, String email, String name, String username, String password) {

		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	//getter&setter
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//toString
	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}
