package RepeatedExams;

import java.util.Arrays;
import java.util.Scanner;

public class MT3_CalculateAverageAge {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Assume you have the following arrays: ");
		int ages[] = { 13, 11, 15, 17, 18, 21, 23 };
		System.out.println("Ages: " + Arrays.toString(ages));
		char gender[] = { 'F', 'F', 'M', 'F', 'M', 'F', 'M' };
		System.out.println("Gender: " + Arrays.toString(gender));

		System.out.println("Output of the main program: ");
		getAverageAge(ages, gender);
	}

	public static void getAverageAge(int[] ages, char[] gender) {
		int countOfFemales = 0;
		int countOfMales = 0;
		double sumOfFemales = 0;
		double sumOfMales = 0;
		System.out.println("Choose a gender(F = female, M = Male): ");
		if (input.next().charAt(0) == 'F') {
			for (int i = 0; i < gender.length && i < ages.length; i++) {
				if (gender[i] == 'F') {
					sumOfFemales += ages[i];
					countOfFemales++;
				}
			}
			System.out.print("Average age of females this group is " + (sumOfFemales / countOfFemales));
		} else {
			for (int i = 0; i < gender.length && i < ages.length; i++) {
				if (gender[i] == 'M') {
					sumOfMales += ages[i];
					countOfMales++;
				}
			}
			System.out.print("Average age of males this group is " + (sumOfMales / countOfMales));
		}
	}
}
