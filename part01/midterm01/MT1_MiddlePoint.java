package RepeatedExams;

import java.util.Scanner;

public class MT1_MiddlePoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		if (n1 - n2 == n1 - n3) {
			int swap = n1;
			n1 = n2;
			n2 = n3;
			n3 = swap;
			System.out.println("There is a midpoint!");
		} else {
			System.out.println("There is no a midpoint!");
		}

		input.close();
	}

}
