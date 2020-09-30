package RepeatedExams;

public class MT3_PrintRepeatingChars {

	public static void main(String[] args) {

		printRepeats("oops");
		printRepeats("illness");
		printRepeats("baby");
	}

	public static void printRepeats(String string) {

		int index = 0;
		boolean isRepeats = true;
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i - 1) == string.charAt(i)) {
				isRepeats = true;
				index = i;
				System.out.println("Character '" + string.charAt(index) + "' repeats at " + (index - 1) + "-" + index);
			}
		}
		if (isRepeats == false)
			System.out.println("No character repeats");
	}
}
