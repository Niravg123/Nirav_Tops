package Statements;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Value of a : ");
	int a = sc.nextInt();
	System.out.println("Value of b : ");
	int b = sc.nextInt();
	System.out.println("Name : ");
	String name = sc.next();
	double d = sc.nextDouble();
}
}
