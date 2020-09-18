package RepeatedExams;

import java.util.Scanner;

public class MT1_LunchTime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter start time: ");
		int hour1 = input.nextInt();
		int minute1 = input.nextInt();
		System.out.println("Enter end time: ");
		int hour2 = input.nextInt();
		int minute2 = input.nextInt();

		if ((0 <= hour1 && hour1 <= 23) || (0 <= hour2 && hour2 <= 23) && (0 <= minute1 && minute1 <= 59)
				|| (0 <= minute2 && minute2 <= 59)) {
			System.out.println("Lunch break between " + hour1 + ":" + minute1 + " and " + hour2 + ":" + minute2);
		}

		if (((60 - minute1) + (minute2)) >= 45) {
			System.out.println("You have enough time for lunch");
		} else {
			System.out.println("You have no enough time for lunch");
		}
		if ((((hour2 * 60) + minute2) - ((hour1 * 60) + minute1)) >= 45) {
			System.out.println("You have enough time for lunch");
		} else {
			System.out.println("You have no enough time for lunch");
		}
		input.close();
	}

}
