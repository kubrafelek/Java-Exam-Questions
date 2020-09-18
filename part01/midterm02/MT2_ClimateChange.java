package RepeatedExams;

public class MT2_ClimateChange {

	public static void main(String[] args) {

		double avegareRises = 0.2;
		double celcius = 13.8;
		int decades = 0;
		for (decades = 0; celcius < 16; decades++) {
			celcius += avegareRises;
		}
		System.out.println("The global temperature will reach 16 C in " + (decades) + " decades after 1950 .");
		System.out.print("In year " + (1950 + (decades * 10) + " global temperature will be "));
		System.out.printf("%4.2f", celcius);

	}

}
