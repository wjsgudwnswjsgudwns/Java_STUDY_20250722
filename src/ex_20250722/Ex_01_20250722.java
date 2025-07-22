package ex_20250722;

public class Ex_01_20250722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product();
		
		product1.price = 1000;
		product1.quantity = 10;
		
		System.out.println("총 가격 : " + product1.getTotalPrice());
	}

}
