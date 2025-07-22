package ex_20250722;

public class Ex_02_20250722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score score1 = new Score();
		
		score1.kor = 90;
		score1.eng = 100;
		score1.math = 60;
		
		System.out.println("총점 : " + score1.printScore());
		
		int avg = score1.printScore() / 3;
		System.out.println("평균 : " + avg);
		
		if (avg>=90) {
			System.out.println("우수");
		} else if(avg>=60) {
			System.out.println("보통");
		} else {
			System.out.println("재시험");
		}
	}

}
