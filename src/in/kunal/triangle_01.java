package in.kunal;

public class triangle_01 {
	
	public static void main(String[] args) {
		
//		output
//		1
//		01
//		101
//		0101
//		10101
//		
		int n = 5 ;
		for( int i = 1 ; i<=n;i++) {
			for(int j= 1 ; j<=i; j++) {
				int even = i+j;
				if(even%2==0) {
					System.out.print("1" + " ");
				} else {
					System.out.print("0" + " ");
				}
				
			}
			
			System.out.println();
		}
	}

}
