package exams;

import java.util.Scanner;

public class RoundTo10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a double: ");
		double number = input.nextDouble();
		
		/*Hold the number for original*/
		double newNumber = number;
		
		number = (number * 10);
		
		int digit = (int) (number % 10);
		if(digit < 5) {
			newNumber -= 1; 
		}else {
			newNumber += 1;
		}
		System.out.println(digit);
		
		System.out.print("Rounded to nearest 10: " + (int)newNumber);
		input.close();
	}

}
