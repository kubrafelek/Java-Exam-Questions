package RepeatedExams;

import java.util.Scanner;

public class MT2_CountVotes {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("print the following: ");
		countVotes();

	}

	public static void countVotes() {
		System.out.println("Enter votes ");
		System.out.println("['y' : yes, 'n' : no, 'q' : quit]");

		int countTotalVotes = 0;
		int countOfYes = 0;
		while (true) {
			System.out.print("vote? ");
			String chr = input.next();
			if (chr.charAt(0) == 'q') {
				break;
			}
			countTotalVotes++;
			if (chr.charAt(0) == 'y') {
				countOfYes++;
			}
		}
		System.out.println("Total votes = " + countTotalVotes);
		System.out.println("Y percent = " + ((double) (countOfYes * 100) / (countTotalVotes)) + "%");
		if (countOfYes > (countTotalVotes - countOfYes)) {
			System.out.println("Majority say YES");
		} else {
			System.out.println("Majority say NO");
		}
	}

}
