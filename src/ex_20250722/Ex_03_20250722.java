package ex_20250722;

public class Ex_03_20250722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature temp1 = new Temperature();
		
		temp1.celsius = 77;
		
		System.out.println("섭씨 온도가 " + temp1.celsius + "일때");
		System.out.println("화씨 온도 : " + temp1.toFahrenheit());
	}

}
