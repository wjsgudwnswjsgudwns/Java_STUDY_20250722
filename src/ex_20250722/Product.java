package ex_20250722;

public class Product {

	String name;

	int price;

	int quantity;
	
	public int getTotalPrice() {
		return price * quantity;
	}
}
