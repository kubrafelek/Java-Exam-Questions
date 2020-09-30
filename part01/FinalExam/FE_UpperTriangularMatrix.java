package RepeatedExams;

public class FE_UpperTriangularMatrix {

	public static void main(String[] args) {

		int matrix[][] = { { 1, 4, 0, 8, 9 }, { 3, 9, 7, 5, 1 }, { 2, 6, 4, 3, 8 }, { 1, 0, 5, 7, 9 },
				{ 3, 9, 7, 0, 3 } };
		int count = 1;
		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = count; col < matrix.length; col++) {
				sum += matrix[row][col];
			}
			count++;
		}
		System.out.println(sum);
	}

}
