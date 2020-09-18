package RepeatedExams;

import java.util.Arrays;
import java.util.Scanner;

public class MT2_RandomSublist {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("Array is " + Arrays.toString(array));
		int subList[] = getSubList(array);
		System.out.print("\nThe Sub Array returns: ");
		for (int i = 0; i < subList.length; i++) {
			System.out.print(subList[i] + ",");
		}
	}

	public static int[] getSubList(int[] array) {
		int subSize = (int) (Math.random() * array.length);
		int[] result = new int[subSize];
		for (int i = 0; i < result.length; i++) {
			int index = (int) (Math.random() * result.length);
			result[i] = array[index];
		}
		return result;
	}
}
