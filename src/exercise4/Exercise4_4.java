package exercise4;

public class Exercise4_4 {
	public static void main(String[] args) {
		int ans = 0;
		int j = 1;
		
		for(int i = 0; i < 7; i++) {
			ans = j * (i + 1);
			j = ans;
		}
		
		System.out.println(ans);
	}
}
