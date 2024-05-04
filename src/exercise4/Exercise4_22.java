package exercise4;

public class Exercise4_22 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		
		System.out.print(num1);
		
		for( ; num2 <= 1000; ) {
			
			System.out.print(", " + num2);
			
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
	}
}
