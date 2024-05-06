package exercise6;

public class Exercise6_4 {

	public static void main(String[] args) {
		
		Exercise6_4 ins = new Exercise6_4();
		
		ins.triangle1(1,2,3);
		
		System.out.println();
		
		ins.triangle1(1,2,3,4);
		
		System.out.println();
		
		ins.triangle1(1,2,3,4,5);
		
		System.out.println();
		
		ins.triangle2(3);
		
		System.out.println();
		
		ins.triangle2(4);
		
		System.out.println();
		
		ins.triangle2(5);
	}
	
	public void triangle1(int... size) {
		
		for(int s: size) {
			for(int i = 0; i < s; i++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
	
	public void triangle2(int size) {
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
