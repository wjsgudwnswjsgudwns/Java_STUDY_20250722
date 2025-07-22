package chapter06_20250722;

public class Chapter06_05_20250722_Rectangle_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter06_05_20250722_Rectangle rec1 = new Chapter06_05_20250722_Rectangle();
		// 객체 선언 -> 생성자 호출 -> 객체를 메모리에 만듬
		
		
		rec1.height = 20;
		rec1.width = 10;
		
		System.out.println("사각형의 넓이 : " + rec1.recArea());
		
		
		// public Chapter06_05_20250722_Rectangle(int width, int height) {} 를 불러온거임
		// public Chapter06_05_20250722_Rectangle(int width, int height) {} 가 없으면 오류남.
		// width = 100, height = 200 을 전달하면서 객체가 만들어짐.
		Chapter06_05_20250722_Rectangle rec2 = new Chapter06_05_20250722_Rectangle(100, 200);
		
		System.out.println("사각형의 넓이 : " + rec2.recArea());
		
		
		
	}

}
