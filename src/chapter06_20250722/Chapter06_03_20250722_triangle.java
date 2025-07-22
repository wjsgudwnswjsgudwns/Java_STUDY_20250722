package chapter06_20250722;

public class Chapter06_03_20250722_triangle {
	
	//삼각형 추상화 -> 필드, 멤버 변수
	int height;
	int width;
	String color;

	// ***메소드***
	//***삼각형 면적***
	
	// 메소드 만드는 공식 
	// public (반환 해주는 값 / ex>int, double, String...) 작명
	public double triangleArea() {
		double area = height * width * 0.5;
		return area; 
		// 반환 해 주려면 반드시 return(반환,출력)을 해줘야한다.
		// 단, void의 경우는 return 해줄 필요가 없다.
		// 메소드 하나당 하나의 return 밖에 못 가진다.
	}
	
	// 삼각형의 color를 반환
	public String triangleColor() {
		System.out.println("삼각형의 색 : " + color);
		return color;
	}
}
