package chapter06_20250722;

public class Chapter06_01_20250722_Student {
	
	// 멤버변수, 필드, 속성 -> 클랫스 내에서 
	String name; // 학생 이름
	String hakbun;	//학번
	int age;	//나이
	String phone; 	// 폰 번호
	String address; //주소
	int[] scores = new int[3]; // 배열 선언
	
	// main 메소드가 없기 때문에 여기서 실행은 불가능함.
	// 그럼 얘는 왜 존재하느냐
	// 이 클래스를 가지고 main 메소드가 있는 곳에서 사용하는거라 생각하면 됨.
	
	// 클래스 내에 선언된 함수 -> 메소드
	public void outputName() {
		System.out.println(name);
	}
}

// stu1 이라는 객체 안에
// 여러가지 String과 int와 메소드가 들어있는 class를 불러왔음.
// name, hakbun, age... 라는 필드들.
