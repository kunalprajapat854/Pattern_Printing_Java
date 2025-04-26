package in.kunal.arrays;

public class Sec_Smallest {
	
	public static void main(String[] args) {
		int arr [] = {15,14,65,78}; 
		
		int n = arr.length;
		
		int smallest = arr[0];
		
		for(int i = 1 ; i<n ; i++) {
			if ( arr[i] > smallest) 
				smallest = arr[i];
			
		}
		//System.out.println(smallest);
		
		int sec_smallest = Integer.MAX_VALUE;
		
		for(int i = 1 ; i<n ; i++) {
			if (arr[i] != smallest &&  arr[i] < sec_smallest) 
				sec_smallest = arr[i];
			
		}
		System.out.println(sec_smallest);
	}

}
