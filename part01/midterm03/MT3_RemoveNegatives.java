package RepeatedExams;

public class MT3_RemoveNegatives {

	public static void main(String[] args) {
		removeNegatives();
	}

	public static void removeNegatives() {
		int array[] = { -1, 2, 5, 3, -2 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = 0;
			}
			System.out.print(array[i] + ",");
		}
	}

}
