package in.kunal;
import java.util.Scanner;
public class Asc_Dsc_triangle {
	
	public static void main(String[] args) {
		
		
//		output
//		1
//		232
//		34543
//		4567654
//		567898765

		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter N: ");
		int n = scanner.nextInt();  // 5
		
		for(int i = 1 ; i<=n ; i++) {
			int num = i;
			for(int j = 1 ; j<= i; j++) {
				System.out.print(num++);
			}
			 
			num -= 2;
			for(int j = 1 ; j<i;j++) {
				System.out.print(num--);
			}
			System.out.println();
		}
		
		
	}

}
