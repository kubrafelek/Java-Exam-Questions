package RepeatedExams;

import java.util.Scanner;

public class FE_Pyramid {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = input.nextInt();
		printPyramid(n);
		input.close();
	}

	public static void printPyramid(int n) {
		for (int i = n; i >= 0; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print((int) (Math.pow(2, j)) + " ");
			}
			System.out.println();
		}

	}

}
