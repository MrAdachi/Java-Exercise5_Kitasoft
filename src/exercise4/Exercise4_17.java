package exercise4;

public class Exercise4_17 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				
				System.out.printf("%2d%s%d%s%2d", i, "×", j ,"=", i * j);
			}
			System.out.printf("%n");
		}
	}
}
