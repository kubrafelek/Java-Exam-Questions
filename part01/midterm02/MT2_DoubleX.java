package RepeatedExams;

public class MT2_DoubleX {

	public static void main(String[] args) {
		System.out.println("Example: ");
		System.out.println(doubleX("axxbb"));
		System.out.println(doubleX("axaxax"));
		System.out.println(doubleX("aXXbb"));
		System.out.println(doubleX("hellxX"));
	}

	private static boolean doubleX(String string) {
		for (int i = 1; i < string.length(); i++) {
			if ((string.charAt(i - 1) == 'x' && string.charAt(i) == 'x')
					|| string.charAt(i - 1) == 'X' && string.charAt(i) == 'X') {
				return true;
			}
		}
		return false;
	}

}
