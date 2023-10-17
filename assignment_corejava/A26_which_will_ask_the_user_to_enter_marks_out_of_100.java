package assignment_corejava;

import java.util.Scanner;

public class A26_which_will_ask_the_user_to_enter_marks_out_of_100 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Marks");
	int marks = sc.nextInt();
	String grade = "0";
	
	if(marks>91 && marks<=100) 
	{
		grade = "AA";
	} else if(marks>81 && marks<=90) 
	{
		grade = "AB";
	} else if(marks>71 && marks<=80) 
	{
		grade = "BB";
	} else if(marks>61 && marks<=70) 
	{
		grade = "BC";
	} else if(marks>51 && marks<=60) 
	{
		grade = "CD";
	} else if(marks>41 && marks<=50) 
		grade = "DD";

	else if(marks>0 && marks<=40)
	{
		grade = "Fail";
	}
	else 
	{
		System.out.println("Invalid Input");
	}
		System.out.println(grade);
	
}
}
