package in.kunal;

public class Half_Pyramid {

	public static void main(String[] args) {

//		output:
//		*
//		**
//		***
//		****
//		*****

		int n = 5;

//		inner
		for (int i = 1; i <= n; i++) {
//			outer loop
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
