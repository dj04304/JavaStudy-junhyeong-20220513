package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
		/*
		 * hashSet<Student>
		 * 20220001, 김준일, "부산대학교"
		 * 20220002, 김준이, "부경대학교"
		 * 
		 * 20220002의 코드를 가진 학생을 조회
		 * 
		 * 20220001의 코드를 가진 학생을 삭제
		 * 
		 */
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student(20220001, "김준일", "부산대학교"));
		studentSet.add(new Student(20220002, "김준이", "부경대학교"));
		
		//1 조회
		
		Iterator<Student> iterator = studentSet.iterator(); //매번 새로 호출하기 때문에 변수에 꼭 담아줘야한다.
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220002) {
				System.out.println(student);
			}
		}
		
		//2. 삭제
		
		iterator = studentSet.iterator(); //앞에서 iterator 로 인해 값이 다 나갔기 때문에 새로 선언해준다.
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220001) {
				studentSet.remove(student);
			}
		}
		
		System.out.println(studentSet);
		
	}

}
