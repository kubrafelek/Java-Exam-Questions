package RepeatedExams;

import java.util.Scanner;

public class FE_ln {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		double x = input.nextDouble();
		System.out.print("Enter the number of terms (n): ");
		int theNumberOfTerms = input.nextInt();

		double sum = 0;
		for (double i = 1.0; i <= theNumberOfTerms; i++) {
			sum += (1 / (2 * i - 1) * Math.pow((x - 1) / (x + 1), 2 * i - 1));
		}
		System.out.printf("%6.5f", (2 * sum));
		input.close();
	}

}
