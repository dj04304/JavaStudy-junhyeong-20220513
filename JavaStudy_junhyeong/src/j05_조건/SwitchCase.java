package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 29;
		char c = 'd';
		String str = "강주현";
		
		switch(num / 10) {
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		switch(c) {
			case 'a':
				System.out.println("case a");
				break;
			case 'b':
				System.out.println("case b");
				break;
			case 'c':
				System.out.println("case c");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		switch(str) {
			case "김준일":
				System.out.println("case 김준일");
				break;
			case "박준형":
				System.out.println("case 박준형");
				break;
			case "한재안":
				System.out.println("case 한재안");
				break;
			default:
				System.out.println("찾을 수 없음");
		}

	}

}
