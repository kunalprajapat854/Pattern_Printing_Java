package in.kunal.arrays;

import java.util.Arrays;

public class Largest_Element {
	
	public static void main(String[] args) {
		
		int arr [] = {3 , 1 , 9 , 7 , 5 };   // sorting
		int maxarr = maxarr(arr);
		System.out.println(maxarr + " MIN Element In Array");
	}
	
	static int maxarr(int arr[] ) {
		Arrays.sort(arr);
	
	     int  n = arr.length;
	     int max = arr[0];
	     
	     for(int i = 1 ; i<n ; i++) {
	    	 if(max > arr[i]) {
	    		 max = arr[i];
	    	 } 
	     }
	     return max;
		
	}
}

		
		
		
		
 		
		
		
	