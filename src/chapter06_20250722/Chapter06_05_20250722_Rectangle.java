package chapter06_20250722;

public class Chapter06_05_20250722_Rectangle { // 직사각형 클래스
	
	//필드
	int width;	// 직사각형 가로 필드
	int height; // 직사각형 세로 필드
	
	// 생성자
	// public (클래스 이름)() {} <- 이름이 고정
	// 반환 타입이 "아예" 없음
	// 기본 생성자 -> 아무런 내용도 없이 선언만 되어있는 상태, 생략 가능함.
	public Chapter06_05_20250722_Rectangle() {
		 
	}
	
	//  public (클래스 이름)(매개변수/parameter) {}
	public Chapter06_05_20250722_Rectangle(int width, int height) {
		 this.width = width;	 // main에서 받아온 값을 초기화 
		 this.height = height; // main에서 받아온 값을 초기화
	}
	
	

	// 메소드
	public int recArea() {
		return width * height;
	}

	
}
