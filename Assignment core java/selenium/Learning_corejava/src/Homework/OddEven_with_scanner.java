package Homework;

import java.util.Scanner;

public class OddEven_with_scanner {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you checked");
		int num = sc.nextInt();
		if(num>0) {
			if(num%2==0) {
				System.out.println("Even");
			}
			else
				System.out.println("Odd");
		}
		
	}
}
