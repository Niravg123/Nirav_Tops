package Assignment;

import java.util.Scanner;

public class print_pattern_given_below {

	public static void main(String[] args) {
		
		System.out.println("************"); //1
		
		int m = 5;
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("************"); //2
		
		int n = 5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum%2==0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("*************"); //3
		
		int o = 4;
		
		for(int i=1;i<=o;i++) {
			for(int j=1;j<=o-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("*************"); //4
		
		int p = 3;
		for(int i=1;i<=p;i++) {
			for(int j=1;j<=p-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=p;i>=1;i--) {
			for(int j=1;j<=p-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		System.out.println("**************"); // enter his/her marks (out of 100).
		
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
			
			
			System.out.println("************");
		
		int num = 5; // find factorial for Given Number.
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("fact is :"+fact);	
			
			System.out.println("*************"); //fibonacci series
			
			int a = 0;
			int b = 1;
			int c;
			
			System.out.print(a+" "+b);
			
			for(int i=1;i<=10;i++) {
				
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
			
			System.out.println("**************");
			
			int q = 10;					//10 natural number
			
			for(int i=1;i<11;i++) {
				
				System.out.println(i);
			}
			
			System.out.println("**************");
			
			int r = 50;
			int s = 30;
			int t = 80;
			
			if(r>=s && r>=t) {
				
				System.out.println(r+ "r is the greatest number");
			} else if (s>=r && s>=t) {
				System.out.println(s+ "s is the greatest number");
			} else {
				
				System.out.println(t+ "t is the greatest number");
			}
			
			
			System.out.println("***************");
			
			
			
			
			
	}

}