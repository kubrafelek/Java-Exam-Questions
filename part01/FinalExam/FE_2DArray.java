package RepeatedExams;

public class FE_2DArray {

	public static void main(String[] args) {
		int[][] array = { { 13, 11, 20, 0, 18 }, { 8, 10, 0, 12, 11 }, { 13, 11, 20, 0, 18 }, { 20, 18, 23, 16, 0 },
				{ 11, 14, 0, 10, 9 }, { 9, 6, 0, 5, 11 }, { 17, 0, 13, 15, 14 } };
		int avg[] = getQuestionAverage(array);
		for (int i = 0; i < avg.length; i++) {
			System.out.println("Question " + (i + 1) + " average is " + (avg[i] / array.length));
		}
	}

	public static int[] getQuestionAverage(int[][] array) {
		int[] average = new int[array[0].length];
		for (int col = 0; col < average.length; col++) {
			for (int row = 0; row < average.length; row++) {
				average[col] += array[row][col];
			}
		}
		return average;
	}
}
