package in.kunal.arrays;
public class Largest_Element {
	
	public static void main(String[] args) {
		
		int arr [] = {10,20,35,45};
		int maxarr = maxarr(arr);
		System.out.println(maxarr + " Max Element In Array");
	}
	
	static int maxarr(int arr[] ) {
	     int  n = arr.length;
	     int max = arr[0];
	    // int min = arr[0];
	     
	     for(int i = 1 ; i<n ; i++) {
	    	 if(max < arr[i]) {
	    		 max = arr[i];
	    		// System.out.println(max);
	    	 } 
	     }
	     return max;
		
	}
}

		
		
		
		
 		
		
		
	