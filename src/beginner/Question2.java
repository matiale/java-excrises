package beginner;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Hello " + name);
		//test
	}

}
