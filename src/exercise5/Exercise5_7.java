package exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5_7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("数値1 : ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.print("数値2 : ");
		int y = Integer.parseInt(br.readLine());
		
		int kuku[][] = new int[9][];
		
		//配列 kuku に値を代入する
		for( int i = 0 ; i < 9 ; i++ ) {
			
			kuku[i] = new int[9]; // kukuの1行目の配列には9つの要素を格納できる
			
			for( int j = 0 ; j < 9 ; j++ ) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		
		System.out.printf( " %2d", kuku[x - 1][y - 1] );

	}
}
