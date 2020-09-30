package RepeatedExams;

public class FE_LocalMinimum {

	public static void main(String[] args) {

		System.out.print("Input:");
		int arr[] = { 23, 8, 15, 2, 3 };
		System.out.println("Output: Index of the first local minimum is " + findLocalMinimum(arr));
	}

	public static int findLocalMinimum(int[] arr) {
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

}
