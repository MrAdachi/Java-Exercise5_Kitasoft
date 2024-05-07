package exercise6;

public class Exercise6_8 {

	public static void main(String[] args) {
		
		Exercise6_8 ins = new Exercise6_8();
		
		for(int i = 11; i <= 20; i++) {
			ins.fi(i);
		}
		System.out.println();
		
	    for( int n = 11 ; n <= 20 ; n++ ) {
	        System.out.print( Fibonacci( n ) + " " );
	    }
	}
	
	public void fi(int a) {
		
		int x1 = 0;
		int x2 = 1;
		int x3 = 0;
		
		for(int i = 2; i <= a; i++) {
			x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
		}
		
		System.out.print(x2 + " ");
	}
	
	static int Fibonacci( int n ){
	    if( n == 0 ) {
	        return 0;
	    } else if( n == 1 ) {
	        return 1;
	    } else {
	        return Fibonacci( n - 2 ) + Fibonacci( n - 1 );
	    }
	}
}
