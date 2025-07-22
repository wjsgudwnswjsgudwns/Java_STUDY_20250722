package chapter06_20250722;

public class Chapter06_02_20250722_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chapter06_01_20250722_Student stu1 = new Chapter06_01_20250722_Student(); 
		// 메모리에 Chapter06_01_20250722_Student이라는 객체가 생성. "stu1<<<객체"
		// 메모리 안에 있는 실물은 '인스턴스' , 코드에서 존재하는 놈은 '객체'
		// 동일시 봐도 무방하나 엄밀히는 다르다. 그래도 개념 자체는 알아둬라.
		stu1.name = "홍길동";
		stu1.hakbun = "202507544";
		stu1.age = 22;
		stu1.phone = "010-1234-1234";
		stu1.address = "서울시 종로구";
		stu1.scores[0] = 90;
		stu1.scores[1] = 80;
		stu1.scores[2] = 70;
		
		stu1.outputName(); // = System.out.println(stu1.name);
		
		Chapter06_01_20250722_Student stu2 = new Chapter06_01_20250722_Student();
		stu2.name = "김유신";
		stu2.hakbun = "202507547";
		stu2.age = 21;
		stu2.phone = "010-5678-5678";
		stu2.address = "서울시 강남구";
		
		stu2.outputName(); // = System.out.println(stu2.name);
		
		
	}

}
