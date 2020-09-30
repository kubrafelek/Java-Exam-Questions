package RepeatedExams;

import java.util.Arrays;

public class MT3_ConsecutiveNumbers {

	public static void main(String[] args) {
		int list1[] = { 16, 17, 18, 19 };
		System.out.println(Arrays.toString(list1));
		System.out.print("isConsecutive (list1) returns " + isConsecutive(list1));

		int list2[] = { 16, 17, 18, 19, 20, 19 };
		System.out.println("\n" + Arrays.toString(list2));
		System.out.print("isConsecutive (list2) returns " + isConsecutive(list2));
	}

	public static boolean isConsecutive(int[] list1) {

		for (int i = 1; i < list1.length; i++) {
			if (list1[i - 1] + 1 != list1[i]) {
				return false;
			}
		}
		return true;
	}

}
