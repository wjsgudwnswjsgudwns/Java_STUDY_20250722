package java_20250722;

import java.util.Arrays;

public class Chapter05_03_20250722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr1 = null; // 집은 있는데 주소가 없음
		
//		numArr1[0]=100; // 택배하러 왔는데 주소가 없음 어케 찾아감
		
		int[] numArr2 = {10,20,30,40,50};
		numArr1 = numArr2; // numArr2의 주소값을 numArr1이 복붙함 -> 해시코드 값이 같아짐 | 실제 메모리가 새로 생긴 건 아님. (얕은 복사)
		System.out.println(numArr1[3]);
		
		System.out.println("numArr1의 해시 코드 : " + System.identityHashCode(numArr1));
		System.out.println("numArr2의 해시 코드 : " + System.identityHashCode(numArr2));
		
		System.out.println("=======================================================");
		
		int[] numArr3 = null;
		int[] numArr4 = {100,200,300};
		
		numArr3 = Arrays.copyOf(numArr4, 3); // 빈 대상 = Arrays.copyOf(복사할 대상, 복사할 갯수)
		// 둘의 메모리의 번지수가 다름 | 해시코드가 다름
		// 같은 내용의 새로운 메모리를 쓰게 복사가 된다. (깊은 복사)
		for(int num:numArr3) {
			System.out.println(num);
		}
		
		System.out.println("numArr3의 해시 코드 : " + System.identityHashCode(numArr3));
		System.out.println("numArr4의 해시 코드 : " + System.identityHashCode(numArr4));
		
		System.out.println("=======================================================");
		
		String str = null;
		str = "kor";
		
		String str2 = "Kor";
		str2 = null;
		
	}

}
