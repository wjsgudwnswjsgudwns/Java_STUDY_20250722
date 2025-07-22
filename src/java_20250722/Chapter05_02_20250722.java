package java_20250722;

public class Chapter05_02_20250722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Kor";
		String str2 = "Kor"; // 기존 문자열이 존재하는지 검색후에 똑같은 문자열이 있다면 같은 주소를 사용
		String str3 = new String("Kor"); // 메모리에 새로 문자열을 생성
		String str4 = new String("Kor"); // 메모리에 새로 문자열을 생성
		
		// 문자열 변수는 참조타입이므로 해당 조건식은 str1과 str3의 값을 비교하는 것이 아니라
		// str1과 str3가 가지고 있는 실제 문자열이 저장되어 있는 메모리의 번지를 비교하는 것이다.
		if(str1==str3) { // 문자열 비교는 == 사용하지 말자.
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		
		if(str1==str2) { // 같은 메모리를 사용하기 때문에 true
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		
		if(str3==str4) { // 문자열 비교는 == 사용하지 말자.
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		
		if(str1.equals(str3)) {	// 문자열 비교는 equals를 사용
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		
		System.out.println("Str1의 해시 코드 : " + System.identityHashCode(str1));
		System.out.println("Str2의 해시 코드 : " + System.identityHashCode(str2));
		System.out.println("Str3의 해시 코드 : " + System.identityHashCode(str3));
		System.out.println("Str4의 해시 코드 : " + System.identityHashCode(str4));
		
	}

}
