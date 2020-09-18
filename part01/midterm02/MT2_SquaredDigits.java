package RepeatedExams;

public class MT2_SquaredDigits {

	public static void main(String[] args) {

		int k = 9;
		int number = 1;
		int magicNumber = number;
		while (magicNumber < 100) {
			int d1 = number % 10;
			number /= 10;
			int d2 = number % 10;
			number /= 10;
			if ((Math.pow(d1, 2) + Math.pow(d2, 2) + k) == magicNumber) {
				System.out.println("Magic numbers: " + magicNumber);
			}
			magicNumber++;
			number = magicNumber;
		}
	}

}
