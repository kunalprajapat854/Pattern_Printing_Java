package in.kunal.arrays;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		int arr[] = { 50, 40, 30, 20, 10 };
		
		Arrays.sort(arr);  // using predefined method 
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
//		int n = arr.length;
//		int temp = 0;
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			System.out.print(arr[i] + " ");
		}
	}


