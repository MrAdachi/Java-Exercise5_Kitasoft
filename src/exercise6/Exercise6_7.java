package exercise6;

public class Exercise6_7 {

	public static void main(String[] args) {
		
		Exercise6_7 ins = new Exercise6_7();
		
		for(int i = 10000; i < 10100; i++) {
			ins.prime(i);
		}

	}
	
	public void prime(int a) {
		int i;
		for(i = a - 1; i > 1; i--) {
			
			if(a % i == 0) {
				break;
			}
		}
		
		if(i == 1) {
			System.out.print(a + " ");
		} else {
			// System.out.print(a + " ");
		}
	}
}
