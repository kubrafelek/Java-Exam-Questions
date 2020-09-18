package RepeatedExams;

import java.util.Scanner;

public class MT1_RoundToTen {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a double: ");
		double number = input.nextDouble();

		int newNumber = (int) number;
		newNumber = ((newNumber + 5) / 10) * 10;
		System.out.println("Rounded to nearest 10: " + newNumber);
		input.close();
	}

}
