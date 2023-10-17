package assignment_corejava;

public class A16_demonstrate_multiple_catch_blocks {
public static void main(String[] args) {
	
	System.out.println("code started");
	try 
	{
		int i =20;
		int j=i/0;
		System.out.println(j);
		
		int a[] = new int[20];
		a[21] = 100;
	} 
	
	catch (ArithmeticException e) {
		e.printStackTrace();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}  
	
	System.out.println("code ended");
}
}
