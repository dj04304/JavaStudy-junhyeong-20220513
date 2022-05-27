package j12_상속.동물;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		animal.move(); // animal 클래스 내에 move를 가져옴
		human.move(); // human 클래스 내에 move를 가져옴
		tiger.move(); // tiger 클래스 내에 move를 가져옴(animal 상속)
		
		
		human.readBooks(); //human 클래스 내에 readBooks를 가져옴
		tiger.hunting(); //tiger 클래스 내에 hunting를 가져옴
	}

}
