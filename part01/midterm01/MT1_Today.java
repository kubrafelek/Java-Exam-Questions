package RepeatedExams;

import java.util.Scanner;

public class MT1_Today {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds / 1000;
		// long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		// long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		// long currentHours = totalHours % 24;
		long totalDays = totalHours / 24;

		System.out.println("Time in MilliSec: " + totalMilliSeconds);
		System.out.println("Total days: " + totalDays);

		int today = ((int) totalDays / 365) % 7 ;
		switch (today) {
		case 0:
			System.out.println("Today: " + "Sunday");
			break;
		case 1:
			System.out.println("Today: " + "Monday");
			break;
		case 2:
			System.out.println("Today: " + "Tuesday");
			break;
		case 3:
			System.out.println("Today: " + "Wednesday");
			break;
		case 4:
			System.out.println("Today: " + "Thursday");
			break;
		case 5:
			System.out.println("Today: " + "Friday");
			break;
		case 6:
			System.out.println("Today: " + "Saturday");
			break;
		default:
			break;
		}
		input.close();
	}
}
