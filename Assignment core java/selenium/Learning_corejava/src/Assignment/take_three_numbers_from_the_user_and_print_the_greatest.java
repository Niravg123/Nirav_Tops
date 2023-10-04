package Assignment;

import java.util.Scanner;

public class take_three_numbers_from_the_user_and_print_the_greatest {

	
	public static void main(String[] args) {
		
		int a = 50;
		int b = 30;
		int c = 80;
		
		if(a>=b && a>=c) {
			
			System.out.println(a+ "is the greatest number");
		} else if (b>=a && b>=c) {
			System.out.println(b+ "b is the greatest number");
		} else {
			
			System.out.println(c+ "c is the greatest number");
		}
	}
}
