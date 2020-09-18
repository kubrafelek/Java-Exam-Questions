package RepeatedExams;

import java.util.Scanner;

public class MT2_RollADie {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a min value:");
		int minValue = input.nextInt();
		System.out.println("\nFinished after " + rollDie(minValue) + " rolls!");
		input.close();
	}

	public static int rollDie(int min) {
		int countOfMinValue = 0;
		int countOfRolls = 0;

		while (countOfMinValue < 4) {
			int randNumber = ((int) (Math.random() * 6)) + 1;
			System.out.print(randNumber + ",");
			if ((min >= randNumber)) {
				countOfMinValue++;
			} else {
				countOfMinValue = 0;
			}
			countOfRolls++;
		}
		return countOfRolls;
	}
}
