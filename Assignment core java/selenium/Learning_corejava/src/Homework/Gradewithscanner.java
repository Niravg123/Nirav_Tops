package Homework;

import java.util.Scanner;

public class Gradewithscanner {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter marks");
	int marks = sc.nextInt();
	char grade = 0;
	
	if(marks>90 && marks<=100)
	{
		grade = 'A';
	}
	else if(marks>70 && marks<=90)
	{
		grade = 'B';
	}
	else if(marks>50 && marks<=70)
	{
		grade = 'C';
	}
	
	else if(marks>35 && marks<=50)
	{
		grade = 'D';
	}
	else if(marks>0 && marks<=35)
	{
		grade = 'F';
	}
	else 
	{
		System.out.println("Invalid Input");
	}
		System.out.println(grade);
	}
}