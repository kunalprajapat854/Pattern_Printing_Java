package in.kunal.arrays;
import java.util.Scanner;
public class Example {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr [] = new int[10];
		
		for(int i = 1 ;i<=10;i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 9 ;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
		
		
	}
}

		
		
		
		
 		
		
		
	