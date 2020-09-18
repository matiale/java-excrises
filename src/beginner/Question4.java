package beginner;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		System.out.println("write down the elements:"); //print a message

		Scanner s = new Scanner(System.in); //creates the read data
		int one = 1, sum = 0;
		while(one !=0) {
			for (Integer i=0; i<1; i++) {
				String text = s.nextLine(); //reads the text
				one = Integer.parseInt(text);//text into a number
				sum = sum+one;
			}
			System.out.println("the sum of the elements is, right 0 when you finished: " + sum);
		}
	}
}
