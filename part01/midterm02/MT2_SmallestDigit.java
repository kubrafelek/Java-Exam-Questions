package RepeatedExams;

import java.util.Scanner;

public class MT2_SmallestDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int countOfDigits = 0;
		int smallest = Integer.MAX_VALUE;
		while (number > 0) {
			int digit = number % 10;
			countOfDigits++;
			if (digit < smallest) {
				smallest = digit;
			}
			number /= 10;
		}
		System.out.println("Number has " + countOfDigits + " digits. " + "Smallest digit is " + smallest);
		input.close();
	}

}
