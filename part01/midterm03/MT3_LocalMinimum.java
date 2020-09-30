package RepeatedExams;

import java.util.Arrays;
import java.util.Scanner;

public class MT3_LocalMinimum {

	public static void main(String[] args) {
//{ 3, 2, 1 }
//{ 1, 2, 3 }
// { 23, 8, 15, 2, 3 }
// { 9, 6, 3, 14, 5, 7, 4 }
		int array[] = { 23, 8, 15, 2, 3 };
		Scanner input = new Scanner(System.in);
		System.out.print("Input:  " + Arrays.toString(array));
		int index = 0;
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[min] > array[i]) {
				array[min] = array[i];
				index = i;
			}
		}
		System.out.println("\nOutput: Index of the first local minimum is " + index);
		input.close();
	}

}
