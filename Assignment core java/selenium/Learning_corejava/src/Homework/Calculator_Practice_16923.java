package Homework;

public class Calculator_Practice_16923 {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("Enter Value of a");
		int b = 20;
		System.out.println("Enter Value of b");
		int choice = 1;
		System.out.println("Enter Value of choice : ");
		if(choice == 1) {
			System.out.println(a+b);
		} else if (choice == 2) {
			System.out.println(a-b);
		} else if (choice == 3) {
			System.out.println(a*b);
		} else if (choice == 4) {
			System.out.println(a/b);
		} else {
			System.out.println("Invalid choice");
		}
	}
}
