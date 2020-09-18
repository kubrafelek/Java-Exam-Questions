package RepeatedExams;

public class MT2_Recursive {

	public static void main(String[] args) {
		printMultipleOf5(64, 123);
	}

	private static void printMultipleOf5(int i, int j) {
		if (j < i)
			return;
		switch (i % 5) {
		case 1:
			i += 4;
			break;
		case 2:
			i += 3;
			break;
		case 3:
			i += 2;
			break;
		case 4:
			i += 1;
			break;
		}
		System.out.print(i + " ");
		printMultipleOf5(i + 5, j);
	}
}
