package beginner;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
System.out.println("What is the radius of your rectangal?");
		
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		Double radius = Double.parseDouble(text);
	
		System.out.println("The radius of your circle is: " + radius);
		
		System.out.println("The are of your circle is: " + (radius * radius * Math.PI));

	}

}
