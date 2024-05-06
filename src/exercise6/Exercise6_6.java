package exercise6;

public class Exercise6_6 {

	public static void main(String[] args) {
		
		Exercise6_6 ins = new Exercise6_6();
		
		for(int i = 1; i <= 9; i++) {
			ins.times_table(i);
			System.out.println();
		}
	}
	
	public void times_table(int a) {
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d", a * i);
		}
	}
}
