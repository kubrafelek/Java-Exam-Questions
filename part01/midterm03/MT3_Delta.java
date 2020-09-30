package RepeatedExams;

import java.util.Arrays;

public class MT3_Delta {

	public static void main(String[] args) {

		int numbers2[] = { 3, 8, 2, 5, 1, 9 };
		int delta[] = delta(numbers2);
		System.out.print(Arrays.toString(delta));
	}

	public static int[] delta(int[] numbers2) {
		int sub[] = new int[numbers2.length - 1];
		for (int i = 1; i < numbers2.length; i++) {
			sub[i - 1] = numbers2[i] - numbers2[i - 1];
		}
		int index = -2;
		int array[] = new int[11];
		for (int i = 0; i < numbers2.length; i++) {
			array[index += 2] = numbers2[i];
		}
		index = -1;
		for (int i = 0; i < sub.length; i++) {
			array[index += 2] = sub[i];
		}
		return array;
	}

}
