package chapter05_20250722;

enum Season {
	SPRING, SUMMER, FALL, WINTER
}

public class Chapter05_06_20250722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Season now = Season.SUMMER;
		
		switch (now) {
		case SPRING:
			System.out.println("봄");
			break;
		case SUMMER:
			System.out.println("여름");
			break;
		case FALL:
			System.out.println("가을");
			break;
		case WINTER:
			System.out.println("겨울");
			break;
		}
		
	}

}
