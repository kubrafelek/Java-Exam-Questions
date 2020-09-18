package RepeatedExams;

public class MT2_MinimumGap {
	public static void main(String[] args) {
		int array[] = { 3, 5, 11, 4, 8 };
		System.out.println("The smallest number is " + minGap(array));
		System.out.println("The smallest number is " + minGap1(array));
	}

	public static int minGap(int[] array) {
		int theMinimumGap = 0;
		for (int i = 1; i < array.length; i++) {
			theMinimumGap = array[i] - array[i - 1];
			if ((theMinimumGap < 0) && (array.length > 2)) {
				return theMinimumGap;
			}
		}
		return 0;
	}

	public static int minGap1(int[] A) {
		int mGap = A[0] - A[1];
		for (int i = 0; i < A.length - 1; i++) {
			int gap = A[i] - A[i + 1];
			if (gap < mGap) {
				mGap = gap;
			}
		}
		return mGap;

	}
}
