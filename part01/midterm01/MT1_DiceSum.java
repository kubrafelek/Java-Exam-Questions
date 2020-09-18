package RepeatedExams;

import java.util.Scanner;

public class MT1_DiceSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		int sum = input.nextInt();
		int n1 = 0;
		int n2 = 0;
		int dice = 0;
		while (n1 + n2 != 9) {
			n1 = (int) (Math.random() * 6) + 1;
			n2 = (int) (Math.random() * 6) + 1;
			dice = n1 + n2;
			System.out.println(n1 + " and " + n2 + " = " + dice);
			if (n1 + n2 == sum) {
				break;
			}
		}
		input.close();
	}

}
