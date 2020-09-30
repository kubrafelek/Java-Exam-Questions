package RepeatedExams;

import java.util.Arrays;
import java.util.Scanner;

public class MT3_RandomOddArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N (size of array): ");
		int sizeOfArray = input.nextInt();
		int array[] = new int[sizeOfArray];

		for (int i = 0; i < array.length; i++) {
			int randOdd = (int) (Math.random() * 11);
			while (randOdd % 2 == 0) {
				randOdd = (int) (Math.random() * 11);
				array[i] = randOdd;
			}
			array[i] = randOdd;
		}
		System.out.println(Arrays.toString(array));
		input.close();
	}

}
