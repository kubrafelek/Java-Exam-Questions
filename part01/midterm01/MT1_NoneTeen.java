package RepeatedExams;

import java.util.Scanner;

public class MT1_NoneTeen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		int sum = n1 + n2 + n3;
		int countOfTeen = 0;
		if ((13 < n1 && n1 <= 19)) {
			countOfTeen++;
			sum -= n1;
		}
		if ((13 < n2 && n2 <= 19)) {
			countOfTeen++;
			sum -= n2;
		}
		if ((13 < n3 && n3 <= 19)) {
			countOfTeen++;
			sum -= n3;
		}

		if (countOfTeen == 1) {
			System.out.println("Oneteen");
		} else if (countOfTeen == 2) {
			System.out.println("Twoteen");
		} else if (countOfTeen == 3) {
			System.out.println("Threeteen");
		} else {
			System.out.println("Noteen");
		}
		System.out.println("Sum: " + sum);
		input.close();
	}

}
