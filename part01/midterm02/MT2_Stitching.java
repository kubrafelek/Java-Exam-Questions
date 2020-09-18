package RepeatedExams;

public class MT2_Stitching {

	public static void main(String[] args) {
		stitching(6, 2);
		stitching(2, 3);
	}

	public static void stitching(int i, int j) {

		for (int k = 0; k <= 2; k++) {
			for (int m = k; m < i + k; m++) {
				System.out.print((m + 1) + " ");
			}
			System.out.println();
		}
		
	}

}
