package Homework;

public class Grade13923 {
public static void main(String[] args) {
	
	int marks = 100;
	char grade = 0;
	
	if (marks>90 && marks<=100) {
		grade = 'A';
	} else if (marks>70 && marks<=90) {
		grade = 'B';
	} else if (marks>50 && marks<=70) {
		grade = 'c';
	} else if (marks>35 && marks<=50) {
		grade = 'd';
	} else if (marks>0 && marks<=35) {
		grade = 'f';
	} else {
		System.out.println("Invalid Input");
	} {
		System.out.println(grade);
	}
}
}
