package in.kunal;

public class Mountain_Pattern {
	
	public static void main(String[] args) {
		
		int n = 4 ;
		
		for(int i = 1 ; i<=n ;i++) {
			for(int j = 1 ; j <=i ; j++) {
				System.out.print(j + " ");
			}
			for(int k = n-i ; k>=1 ; k--) {
				System.out.print(" ");
			}
			
			for(int k = (2 * (n-i)-1) ; k>=1 ; k--) {
				System.out.print(" ");
			}
			
			
			for(int l = i ; l>=1 ; l--) {
				if(l == n ) {
					continue;
				}
				System.out.print(l + " ");
			}
			System.out.println();
			
		}
		
		
		
	   
	}

}
