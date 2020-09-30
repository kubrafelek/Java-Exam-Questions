package RepeatedExams;

import java.util.Scanner;

public class MT3_CalculateAverageHeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Assume you have the following arrays: ");
		int height[] = { 175, 180, 182, 179, 167, 185, 198 };
		char sports[] = { 'V', 'B', 'F', 'F', 'V', 'F', 'B' };
		System.out.println("This means that for example;\n" + "the first person has an height of " + height[0]
				+ " cm and plays volleyball (" + sports[0] + ")");
		System.out.println("Output of the main program should be: ");
		System.out.print("Choose a sport (V = volleyball, B = basketball, F = footbal):");
		String spor = input.next();
		switch (spor.charAt(0)) {
		case 'V':
			spor = "volleyball";
			break;
		case 'B':
			spor = "basketball";
			break;
		case 'F':
			spor = "football";
			break;
		default:
			break;
		}
		System.out.println(
				"Average height of people playing " + spor + " is " + getAverageHeight(height, sports, spor) + " cm");
		input.close();
	}

	public static double getAverageHeight(int[] height, char[] sports, String spor) {
		int countOfSpor = 0;
		double sumOfHeight = 0;
		for (int i = 0; i < sports.length && i < height.length; i++) {
			if (sports[i] == spor.toUpperCase().charAt(0)) {
				countOfSpor++;
				sumOfHeight += height[i];
			}
		}
		return sumOfHeight / countOfSpor;
	}
}
