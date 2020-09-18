package RepeatedExams;

import java.util.Scanner;

public class MT1_Password {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Enter your age: ");
		int age = input.nextInt();

		char firstLetterOfName = name.charAt(0);
		int rightMostDigitOfAge = age % 10;
		char randLetter = (char) ((char) (Math.random() * ('z' - 'a')) + 'a');
		int randNumber = (int) (Math.random() * 5) + 1;

		System.out.println("Your password is: " + firstLetterOfName + rightMostDigitOfAge + randLetter + randNumber);
		input.close();
	}

}
