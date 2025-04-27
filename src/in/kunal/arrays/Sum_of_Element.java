package in.kunal.arrays;

public class Sum_of_Element {
	
	public static void main(String[] args) {
		int arr [] = {15,15, 40 , 60 , 12}; 
		
		int n =  arr.length;
		int sum = 0 ;
		for(int i = 0 ; i<n ;i++) {
			sum+= arr[i];
		}
		System.out.println(sum);
	}
	

}
