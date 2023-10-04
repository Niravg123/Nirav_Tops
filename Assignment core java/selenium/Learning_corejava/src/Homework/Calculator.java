package Homework;

public class Calculator {
	public static void main(String[] args) {
		
		System.out.println("Enter Value of a : ");
		int a = 10;
		
		System.out.println("Enter Value of b : ");
		int b = 20;
		
		System.out.println("Enter Value of choice : ");
		 int choice = 2; // change choice value and see the answer
		
		if(choice == 1)
		{
			System.out.println(a+b);
		}
		else if(choice == 2)
		{
			System.out.println(a-b);
		}
		else if(choice == 3)
		{
			System.out.println(a*b);
		}
		else if(choice == 4)
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		}
	}
