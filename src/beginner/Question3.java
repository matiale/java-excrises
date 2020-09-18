package beginner;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		System.out.println("Choose one number:");
		
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		Integer one = Integer.parseInt(text);
		System.out.println("The first number is " + one);
		
		System.out.println("Choose a second number:");
		text = s.nextLine();
		Integer second = Integer.parseInt(text);
		
		System.out.println("Your second number is " + second + " The sum of your number is: " + (second + one));
		
	}

}
