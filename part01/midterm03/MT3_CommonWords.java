package RepeatedExams;

public class MT3_CommonWords {

	public static void main(String[] args) {
		String array1[] = { "hi", "Ed", "how", "ARE", "you", "Doing" };
		String array2[] = { "hi", "Bob", "how", "are", "you", "today", "bro?" };
		String array3[] = { "hi", "you", "how", "do", "you", "do", "today?" };

		System.out.println("The method should return " + countCommon(array1, array2, array3));

	}

	public static int countCommon(String[] array1, String[] array2, String[] array3) {

		int countOfSameString = 0;
		for (int i = 0; i < array1.length; i++) {
			if ((array1[i] == array2[i]) && (array1[i] == array3[i])) {
				countOfSameString++;
			}
		}
		return countOfSameString;
	}

}
