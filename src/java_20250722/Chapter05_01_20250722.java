package java_20250722;

public class Chapter05_01_20250722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'K';
		char ch2 = 'o';
		char ch3 = 'r';
		
		char[] chArr = {'K','o','r'};	
		System.out.println(chArr);	// 중랑구에 사는 개똥이
		
		String str1= "Kor";	// 마포구에 사는 개똥이
		String str2= "Kor"; // 마포구에 사는 개똥이
		String str3= "Jap"; // 마포구에 사는 소똥이
		
		System.out.println(chArr.equals(str1));	// 시청에서 중랑구 개똥이와 마포구 개똥이가 같은가? false
		System.out.println(str2.equals(str1));	// 시청에서 마포구 개똥이와 마포구 개똥이가 같은가? true
		System.out.println(str2 == str3);		// 마포구청에서 마포구 개똥이와 마포구 소똥이가 같은가? false
//		System.out.println(chArr == str1);		// 마포구청에서 중랑구 개똥이와 마포구 개똥이가 같은가? 중랑구 개똥이를 모르기 때문에 error
	}

}
