package exercise1;

public class Exercise1_7 {
	public static void main(String[] args) {
		int x = 10;
		int y = 100;
		
		int z = x; //xの値を格納(z)
		x = y;
		y = z;
		System.out.println("x=" + x + ",y=" + y);
	}
}
