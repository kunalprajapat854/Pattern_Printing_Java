package in.kunal;

public class Half_Pyramid_With_Numbers {
	
	public static void main(String[] args) {
		
//		output
//	      1
//	      12
//	      123
//	      1234
//	      12345
		
	    int row = 5 ;
	   
	    for(int i = 1 ; i<=row;i++) {
	    	
	    	for(int j=1; j<=i;j++) {
	    		System.out.print(j+ "");
	   
	    	}
	    	System.out.println();
	    }
	}

}
