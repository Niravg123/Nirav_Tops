package assignment_corejava;

import java.util.Scanner;

public class A1_Take_three_number {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number a :");
	int a = sc.nextInt();
	System.out.println("enter second number b :");
	int b = sc.nextInt();
	System.out.println("enter third number c :");
	int c = sc.nextInt();
	
	if(a>b && a>c) {
		System.out.println("a :"+a+" is greator");
	}
	else if(b>a && b>c) {
		System.out.println("b :"+b+" is greator");
	}
	else {
		System.out.println("c :"+c+" is greator");
	}
	
}
}