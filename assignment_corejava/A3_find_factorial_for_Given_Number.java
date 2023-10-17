package assignment_corejava;

public class A3_find_factorial_for_Given_Number {
public static void main(String[] args) {
	

	int num = 5;
	int fact = 1;
	
	for(int i=1;i<=num;i++) 
	{
		
		fact = fact*i;
	}
	System.out.println("fact is :"+fact);
	
}
}