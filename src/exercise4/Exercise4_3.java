package exercise4;

public class Exercise4_3 {
	public static void main(String[] args) {
		for(int i = 1; i <= 8; i++) {
			System.out.println((int)Math.pow(2, i));
		}
		
		System.out.println("----------------------------");
		
		int n = 1;
		
		for(int j = 1; j <= 8; j++) {
			int ans = n * 2;
			System.out.println(ans);
			n = ans;
		}
		
		System.out.println("----------------------------");
		
		int m = 1;
		
		for(int k = 1; k <= 8; k++) {
			m *= 2;
			System.out.println(m);
		}
	}
}
