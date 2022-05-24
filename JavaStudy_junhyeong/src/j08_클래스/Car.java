package j08_클래스;

//생성자의 특징 1. 반환자료형이 생략되어있다(주소값을 반환하기 때문이다). 2.클래스명이랑 이름이 같다.

public class Car {
	String company;
	String model;
	String color;
	
	void showCompanyInfo() {
		System.out.println(company + "에서 제조된 차량입니다.");
	}
	
	
	
	void showInfoAll() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
	}
	
	String getCar() {

		return company + "_" + model + "_" + color;
		
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	
	
}
