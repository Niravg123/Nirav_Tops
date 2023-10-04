package Statements;

import java.util.Scanner;

public class ScannerDemo_Practice_16923 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("value of a : ");
		int a = sc.nextInt();
		System.out.println("value of b : ");
		int b = sc.nextInt();
		System.out.println("name : ");
		String name = sc.next();
		double d = sc.nextDouble();
		System.out.println(a+b+name+d);
		sc.close();
	}
}
