package beginner;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		System.out.println("write down the elements:"); 

		Scanner s = new Scanner(System.in);
		int one = 1, sum = 0;
		while(one !=0) {
			for (Double i=0.0; i<1; i++) {
				String text = s.nextLine(); 
				
				sum = sum+one;
			}
			System.out.println("the sum of the elements is, right 0 when you finished: " + sum);
		}
	}

}
