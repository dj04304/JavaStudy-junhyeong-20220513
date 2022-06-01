package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)
 * extends Object가 생략되어있다.
 * 모든 클래스의 상위에는 Object가 있기 때문에 Object에 다 담을 수 있다.
 * 그렇기 때문에 Object에 담아서 다운캐스팅하는 형식이 자주 쓰인다.
 * 
 */

public class Teacher {
	private String name;
	private String subject;
	private int age;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) { //obj 안에는 t2가 들어있고, 업 캐스팅 되어있기 때문에 현재 obj안에는 name과 subject가 들어있지 않다.
//		if(obj instanceof Teacher) { //obj가 Teacher클래스 로 생성 되었을 때,
//			Teacher teacher = (Teacher) obj; // obj를 다운캐스팅 한 것을 teacher 변수에 넣어준다.
//			if(this.name.equals(teacher.name) && this.subject.equals(teacher.subject)) {//name과 subject가 들어있는 값이 같은지 비교
//				return true;// name 과 subject 가 같으면 true
//			}
//		}
//		return false; //Teacher class가 아니면 false
//	}
	
	
	
	//toString
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", age=" + age + "]";
	}


	//hashCode
	@Override
	public int hashCode() { 
		return Objects.hash(name, subject);//해시코드를 우리가 사용하고 싶은데로 재정의함
	}


	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //자기자신의 주소와 obj 객체가 같은지 확인
			return true; // 주소가 같기 때문에 바로 true를 return
		if (obj == null) // obj 가 null일때는 빈 객체이기 때문에 바로 false를 return해준다.
			return false;
		if (getClass() != obj.getClass())//서로의 class가 다르면 false를 return해준다.
			return false;
		Teacher other = (Teacher) obj; //obj의 다운캐스팅 값을 other에 담는다.
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	//this.getClass().getSimpleName() == Teacher.class.getSimpleName() 데이터에 대한 로그를 남길 때
	public void classInfo() {
		System.out.println();
	}
	
}
