package Homework;

import java.util.Scanner;

public class Gradewithscanner_practice_16923 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Marks");
	int marks = sc.nextInt();
	char grade = 0;
	
	if(marks>90 && marks<=100) {
		grade = 'a';
	} else if(marks>70 && marks<=90) {
		grade = 'b';
	} else if(marks>50 && marks<=35) {
		grade = 'c';
	} else if(marks>35 && marks<=50) {
		grade = 'd';
	} else if(marks>0 && marks<=35) {
		grade = 'f';
	} else {
		System.out.println("Invalid Input");
	} {
		System.out.println(grade);
	} 
	
}
}
