package RepeatedExams;

public class FE_RandomNumbers {

	public static void main(String[] args) {

		int countOfPos = 0;
		int countOfNeg = 0;

		while (true) {
			int randNum = (int) (Math.random() * -20) + 10;
			if (randNum < 0) {
				countOfNeg++;
				System.out.print(randNum + " ");
			} else {
				countOfPos++;
				System.out.print(randNum + " ");
			}
			if (randNum == 0) {
				continue;
			}
			if (countOfNeg == 3 && countOfPos == 3) {
				break;
			}
		}

	}

}
