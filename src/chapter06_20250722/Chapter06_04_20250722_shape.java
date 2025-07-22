package chapter06_20250722;

public class Chapter06_04_20250722_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter06_03_20250722_triangle tri1 = new Chapter06_03_20250722_triangle();
		
		tri1.height = 20;
		tri1.width = 10;
		tri1.color = "red";
		
		double tri1area= tri1.triangleArea(); // 호출해서 return 값을 double로 받아주고
		System.out.println(tri1area);	// 받을걸 출력해줘야 결과창에 보인다.
		
		tri1.triangleColor();	// 얘는 호출만 해줘도 자체적으로 출력까지 해주기 때문에 호출만 해줘도 출력이 된다
	}

}
