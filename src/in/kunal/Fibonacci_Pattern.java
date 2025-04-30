package in.kunal;

public class Fibonacci_Pattern {
	
	public static void main(String[] args) {
		
		int n = 4 ; 
		int a = 0 , b = 1 ;
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=i ; j++) {
			 int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
			System.out.println();
		}
	}

}
