package exercise6;

public class Exercise6_5 {

	public static void main(String[] args) {
		
		Exercise6_5 ins = new Exercise6_5();
		
		ins.triangle(3, 'A');
		
		System.out.println();
		
		ins.triangle(4, '#');
		
		System.out.println();
		
		ins.triangle(5, '男');
	}
	
	public void triangle(int size, char word) {
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(word);
			}
			System.out.println();
		}
	}
}
