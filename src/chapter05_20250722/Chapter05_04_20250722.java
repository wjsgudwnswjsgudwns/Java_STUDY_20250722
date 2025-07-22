package chapter05_20250722;

public class Chapter05_04_20250722 {

	enum Gender {	// enum (대문자 선언)
		MALE, FEMALE
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender g = Gender.FEMALE;
		
		if(g == Gender.MALE) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}
	}

}
