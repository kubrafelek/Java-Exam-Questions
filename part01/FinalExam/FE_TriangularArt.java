package RepeatedExams;

public class FE_TriangularArt {

	public static void main(String[] args) {
		randomArt(10);
	}

	public static void randomArt(int l) {
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 10; j > i; j--) {
				System.out.print(randCharacter());
			}
			System.out.println();
		}
	}

	public static char randCharacter() {

		int randCharacter = (int) (Math.random() * 3);
		if (randCharacter == 1) {
			return '!';
		} else if (randCharacter == 2) {
			return 'o';
		} else {
			return 'x';
		}
	}
}
