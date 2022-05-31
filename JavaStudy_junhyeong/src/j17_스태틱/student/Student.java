package j17_스태틱.student;

public class Student {
	/*
	 * student_code(정수)
	 * student_name(이름)
	 * student_year(학년)
	 * 
	 * 학생을 한명 생성할 때 마다 자동으로 student_code의 값이 1씩 증가하여 부여될 수 있게 작성
	 * 
	 */
		private static int auto_increment = 20220000; //static 값으로 auto_increment 를 생성해줌 , 학번은 외부에서 접근하면 안되기 때문에 private을 준다.
		private int student_code;
		private String student_name;
		private int student_year;
		
		
		public Student(String student_name, int student_year) {//기본생성자 생성
			this.student_code = ++auto_increment; //생성이 될때마다 1씩 증가 , 따라서 Main에서 따로 매개변수를 이용해 수를 안받아와도 된다.
			this.student_name = student_name;
			this.student_year = student_year;
			
		}
			
		public void showInfo() {
			System.out.println("학번: " + student_code);
			System.out.println("학생 이름: " + student_name);
			System.out.println("학년: " + student_year);
			System.out.println();
			
		}
		
	}
