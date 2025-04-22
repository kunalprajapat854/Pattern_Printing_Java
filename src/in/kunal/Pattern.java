package in.kunal;

public class Pattern {
	
	public static void main(String[] args) {
		
//		output
//		1 2 3 4 5 
//		2 3 4 5 
//		3 4 5 
//		4 5 
//		5 
		
		int n = 5 ;
		
		for(int i = 1 ; i<= n; i++) {
			
			for(int j = i ; j<= n ;j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
