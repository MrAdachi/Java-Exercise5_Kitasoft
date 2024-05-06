package exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5_8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] values = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("整数を入力してください。");
			values[i] = Integer.parseInt(br.readLine());
		}
		
		for( int i = 0 ; i < 10 ; i++ ){
			// i以降の各要素における数値と比較し、値を入れ替える
		    for( int j = i + 1 ; j < 10 ; j++ ){
		        if( values[i] > values[j] ){
		            int t = values[i];
		            values[i] = values[j];
		            values[j] = t;
		        }
		    }
		}

		for( int i = 0 ; i < 10 ; i++ )
		    System.out.print( values[i] + " " );
		
	}

}
