package RepeatedExams;

import java.util.Scanner;

public class FE_MostVisitedPlaces {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of places: ");
		int numberOfPlaces = input.nextInt();

		String names[] = new String[numberOfPlaces];
		int visitors[] = new int[numberOfPlaces];
		for (int i = 0; i < names.length; i++) {
			System.out.print("Enter name: ");
			names[i] = input.next();
			System.out.print("Enter visitors: ");
			visitors[i] = input.nextInt();
		}
		System.out.println("Most Visited Places: ");
		selectionSort(visitors, names);
		input.close();
	}

	public static void selectionSort(int[] visitors, String[] names) {

		for (int i = 0; i < visitors.length - 1; i++) {
			int minVisitor = visitors[i];
			String minName = names[i];
			int minIndex = i;

			for (int j = i + 1; j < visitors.length; j++) {
				if (minVisitor < visitors[j]) {
					minVisitor = visitors[j];
					minName = names[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				visitors[minIndex] = visitors[i];
				visitors[i] = minVisitor;

				names[minIndex] = names[i];
				names[i] = minName;
			}
		}
		for (int i = 0; i < visitors.length; i++) {
			System.out.println((i + 1) + ") " + names[i] + " - " + visitors[i] + " millions");
		}
	}
}
