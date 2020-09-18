package beginner;

import java.util.Scanner;

public class Maths {

	public static void main(String[] args) {
		System.out.println("What is the width of your rectangal?");
		
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		Integer width = Integer.parseInt(text);
		System.out.println("The width of the rectangal is " + width);
	
		System.out.println("what is the length of your rectangal?");
		text =  s.nextLine();
		Integer length = Integer.parseInt(text);
		
		System.out.println("The length of the rectangal is " + length + " .The area of your rectangal is: " + (length*width) + " .The perimeter is: " + (length * 2 + width * 2));
		
		
	}

}
