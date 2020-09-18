package RepeatedExams;

import java.util.Scanner;

public class MT1_CountPatterns {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your words: ");
		String words = input.nextLine();

		String str = "am";
		int count = 0;
		for (int i = 0; i < words.length(); i++) {
			if (str.charAt(0) == words.charAt(i) && str.charAt(1) == words.charAt(i + 1)) {
				count++;
			}
		}
		System.out.println("There are " + count + " occurence of " + str + ".");
		input.close();
	}

}
