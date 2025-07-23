package ex_20250722;

public class Score_solution {
	int kor; 
	int eng;
	int math;
	
	public void printScore() {
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		if (avg>=90) {
			System.out.println("우수");
		} else if (avg>=60) {
			System.out.println("보통");
		} else {
			System.out.println("재시험");
		}
	}
}
