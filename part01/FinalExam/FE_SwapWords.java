package RepeatedExams;

public class FE_SwapWords {
	public static void main(String[] args) {

		// String array2[] = { "ten", "age", "and", "one", "years", "ago" };
		String array1[] = { "to", "be", "or", "not", "to", "be", "hamlet" };

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("\nWill be turned into: ");
		String swap[] = swapPairs(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.print("" + swap[i] + "'" + " , ");
		}
	}

	public static String[] swapPairs(String[] array1) {

		for (int i = 1; i < array1.length; i += 2) {
			String swap = array1[i - 1];
			array1[i - 1] = array1[i];
			array1[i] = swap;
		}
		return array1;
	}
}
