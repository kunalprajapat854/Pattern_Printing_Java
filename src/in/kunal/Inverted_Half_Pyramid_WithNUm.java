package in.kunal;

public class Inverted_Half_Pyramid_WithNUm {
	
	public static void main(String[] args) {
//		output
//		12345
//		1234
//		123
//		12
//		1
		
		int n = 5;
		for(int i = n ;i>=1;i--) {
			for(int j=1 ; j<=i;j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}

}
