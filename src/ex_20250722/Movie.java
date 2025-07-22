package ex_20250722;

public class Movie {
	String title;
	String genre;
	int runtime;
	
	public boolean isLongMovie() {
		return runtime>=120;
	}
}
