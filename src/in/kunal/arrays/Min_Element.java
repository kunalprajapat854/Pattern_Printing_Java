package in.kunal.arrays;

public class Min_Element {
	
	public static void main(String[] args) {
		int arr [] = {10,15,36,45,78};
		
		int n = arr.length;
	    int min = arr[0];
	    
	   for(int i = 0 ; i<n ; i++) {
		   if(min < arr[i]) {
			   min = arr[i];
			  
		   }
		   
	   }
	   System.out.println(min + " " );
	}

}
