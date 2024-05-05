package exercise5;

public class Exercise5_6 {

	public static void main(String[] args) {
		
		int kuku[][] = new int[9][];
		
		//配列 kuku に値を代入する
		for( int i = 0 ; i < 9 ; i++ ) {
			
			kuku[i] = new int[9]; // kukuの1行目の配列には9つの要素を格納できる
			
			for( int j = 0 ; j < 9 ; j++ ) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for( int i = 0 ; i < 9 ; i++ ) {
			for( int j = 0 ; j < 9 ; j++ ) {
				System.out.printf( " %2d", kuku[i][j] );
			}
			System.out.println();
		}
	}
}
