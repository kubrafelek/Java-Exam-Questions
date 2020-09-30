package RepeatedExams;

import java.util.Arrays;

public class MT3_RandomNumbers {

	public static void main(String[] args) {

		int array[] = new int[10];
		for (int i = 0; i < array.length / 2; i++) {
			array[i] = (int) (Math.random() * 11);
			;
		}
		for (int i = (array.length / 2); i < array.length; i++) {
			array[i] = (int) (Math.random() * -11);
		}
		System.out.println(Arrays.toString(array));
	}

}
