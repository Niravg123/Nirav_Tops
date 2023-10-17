package assignment_corejava;

public class A15_demonstrate_try_catch_block {
public static void main(String[] args) {
	
System.out.println("code started...");
	
	try 
	{
		int i = 10;
		int j = i/0;
		System.out.println(j);
		
		int a[] = new int[10];
		a[11] = 50;
	} 
	
	catch (ArithmeticException e) {
		e.printStackTrace();
	}
	System.out.println("code ended");
}
}
