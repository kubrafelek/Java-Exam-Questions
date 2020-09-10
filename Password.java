package exams;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.next();
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		String psw = " "; 
		
		/* First Letter of the user name */
		char firstLetter = name.charAt(0);
		
		/* Right most digit of user age*/
		int rightMost = age % 10;

		/*Random Letter Generator*/
		char randomLetter = (char) ((int)(Math.random() * ('a' - 'z')) + 'z');
		
		/*Random Number Generator*/
		int randomAge = (int)(Math.random() * 6) + 1;
		
		/*Password of user*/
		psw = firstLetter + "" + rightMost + "" +  randomLetter + "" + randomAge;
		
		System.out.print("Your password is: " + psw);
		input.close();
	}

}
