package RepeatedExams;

public class MT2_RandomArt {

	public static void main(String[] args) {
		int number = 5;
		for (int i = 0; i < number; i++) {
			System.out.println();
			for (int j = 0; j < number; j++) {
				System.out.print(randomCharacter() + " ");
			}
			System.out.println();
		}
	}

	public static char randomCharacter() {
		int r = ((int) (Math.random() * 3));

		switch (r) {
		case 0:
			return '+';
		case 1:
			return '*';
		case 2:
			return ' ';
		}
		return ' ';
	}
}
