package in.kunal.arrays;

public class Smallest_Largest {
	
	public static void main(String[] args) {
		int arr [] = {3 , 1 , 9 , 7 , 5 }; 
		
		int n = arr.length;
		
		int smallest = arr[0];
		int largest = arr[0];
		
	    for(int i = 1 ; i<n ; i++) {
	    	if(smallest > arr[i]) 
	    	   smallest = arr[i];
	    	else if(largest < arr[i]) 
	    		largest = arr[i];
	    	
	    }
	    
	    System.out.println(smallest);
	    System.out.println(largest);
	}

}
