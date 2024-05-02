package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_5 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        
        int sum = 0;
        int i;
        
        for(i = 0; i < 10; i++) {
        	System.out.print("入力" + (i + 1) + "回目: ");
            int x = Integer.parseInt(br.readLine());
        	sum += x;
        }
        
        int ans = sum / i;
        System.out.println(ans);
	}

}
