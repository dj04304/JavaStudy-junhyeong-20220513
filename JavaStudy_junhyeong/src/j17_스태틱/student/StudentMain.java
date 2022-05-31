package j17_스태틱.student;

public class StudentMain {

	public static void main(String[] args) {
			Student student1 = new Student("박준형", 1);
			Student student2 = new Student("가나다", 3);
			Student student3 = new Student("마바사", 4);
			Student student4 = new Student("마바사", 2);
			Student student5 = new Student("마바사", 1);
			
			student1.showInfo();
			student2.showInfo();
			student3.showInfo();
			student4.showInfo();
			student5.showInfo();

	}

}
