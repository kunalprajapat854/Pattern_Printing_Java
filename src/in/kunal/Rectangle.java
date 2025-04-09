package in.kunal;

public class Rectangle {
	
//	output:
//	*****
//	*****
//	*****
//	*****
//	
	public static void main(String[] args) {
		int n = 4 ;         //row 
		int m = 5 ;         //column
		
		//inner loop 
		for(int i = 1 ; i<=n ;i++) {
			//outer loop
			for(int j = 1 ; j<=m ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
