package RepeatedExams;

public class MT3_Pyramid {

	public static void main(String[] args) {

		for (int i = 5; i >= 0; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print((int) Math.pow(2, j) + " ");
			}
			System.out.println();
		}
	}

}
