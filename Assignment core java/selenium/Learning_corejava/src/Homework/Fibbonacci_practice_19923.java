package Homework;

public class Fibbonacci_practice_19923 {

	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+" "+b);
		
		for(int i=0;i<10;i++) {
			c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		}
		
		
		
	}
}
