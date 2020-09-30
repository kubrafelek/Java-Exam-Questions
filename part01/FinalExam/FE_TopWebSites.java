package RepeatedExams;

import java.util.Scanner;

public class FE_TopWebSites {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of websites: ");
		int numberOfWebsites = input.nextInt();

		String nameOfWebSites[] = new String[numberOfWebsites];
		int visitorsOfWebSites[] = new int[numberOfWebsites];
		for (int i = 0; i < numberOfWebsites; i++) {
			System.out.print("Enter the name of website: ");
			nameOfWebSites[i] = input.next();
			System.out.print("Enter the number of visitors: ");
			visitorsOfWebSites[i] = input.nextInt();
		}
		System.out.println("Top Websites: ");

		selectionSort(visitorsOfWebSites, nameOfWebSites);
		input.close();
	}

	public static void selectionSort(int visitors[], String names[]) {
		int n = visitors.length;
		for (int i = 0; i < n - 1; i++) {
			int max = visitors[i];
			int maxIndex = i;
			String maxName = names[i];
			for (int j = i + 1; j < n; j++) {
				if (max < visitors[j]) {
					max = visitors[j];
					maxName = names[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				visitors[maxIndex] = visitors[i];
				visitors[i] = max;

				names[maxIndex] = names[i];
				names[i] = maxName;
			}
		}
		for (int i = 0; i < names.length; i++) {
			System.out.print((i + 1) + ") ");
			System.out.print(names[i] + " " + visitors[i]);
			System.out.println();
		}
	}
}
