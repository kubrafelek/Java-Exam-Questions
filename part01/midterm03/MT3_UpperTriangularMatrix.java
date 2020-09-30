package RepeatedExams;

public class MT3_UpperTriangularMatrix {

	public static void main(String[] args) {
		int[] A = { 2, 9, 5, 4, 8, 1, 6 };
		insertionSort(A);
	}

	private static void insertionSort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int currentElement = A[i];
			int k;
			for (k = i - 1; k >= 0 && A[k] > currentElement; k--) {
				A[k + 1] = A[k];
			}
			A[k + 1] = currentElement;
		}

		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
