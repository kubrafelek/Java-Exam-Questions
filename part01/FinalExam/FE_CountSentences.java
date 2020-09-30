package RepeatedExams;

public class FE_CountSentences {

	public static void main(String[] args) {

		System.out.println(countSentences(
				"Steve Wonziak: You can't write code, you're not an engineer, you're not a designer, you can't put a hammer to a nail. I built the circuit board. The graphical interface was stolen from Parc. Jef Raskin was the leader of the Mac team before you threw him off his own project! Someone else designed the box! So how come ten times in a day I read Steve Jobs is a genius? What do you do?"));
	}

	public static int countSentences(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '.' || string.charAt(i) == '!' || string.charAt(i) == '?') {
				count++;
			}
		}
		return count;
	}

}
