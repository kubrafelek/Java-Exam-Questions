package RepeatedExams;

import java.util.Scanner;

public class MT2_PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a digit (1, 3, 7, or 9): ");
		int digit = input.nextInt();

		int number = 1;
		int count = 0;
		System.out.println("First ten prime numbers ending with digit " + digit + ":");
		while (count < 10) {
			if (endsWithDigit(number, digit) == true) {
				System.out.print(number + " ");
				count++;
			}
			number++;
			if (digit != 1 || digit != 3 || digit != 7 || digit != 9) {
				System.out.println("Input error. Enter 1, 3, 7, or 9");
				break;
			}
		}
		input.close();
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean endsWithDigit(int number, int digit) {
		if (isPrime(number) && (number % 10 == digit)) {
			return true;
		}
		return false;
	}

}
