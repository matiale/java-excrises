package beginner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("What year were you born?");
		String text = s.nextLine();
		Integer year = Integer.parseInt(text);
		
		System.out.println(name + " you're " + (2020-year)+ " years old");
				
	}

}
