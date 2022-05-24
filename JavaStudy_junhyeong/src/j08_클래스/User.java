package j08_클래스;

public class User {
	String name;
	String age;
	String phone;
	String address;
	
	User(){ //기본 생성자
		System.out.println("생성");
	}
	
	//오버로딩(클래스명이 같아도 매개변수가 다르면 생성이 가능하다.)
	User(String name){	//사용자정의 생성자
		this.name = name;
	}
	
	User(String name, String age, String phone, String address){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	void setName(String name) { //this --> 생성되었을 때, 자기 자신의 주소를 가리킬수 있는 역할 
		System.out.println("setName 메소드 안에서 호출: " + this);
		this.name = name;
	}
	
}
