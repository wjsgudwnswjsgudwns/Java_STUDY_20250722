package ex_20250722;

public class Ex_04_20250722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie();
		
		movie1.title = "바람과 함께 사라지다(1939)";
		movie1.genre = "로맨스";
		movie1.runtime = 238;
		
		System.out.println(movie1.title+" 영화는 긴 편인가요? : " + movie1.isLongMovie());
	}

}
