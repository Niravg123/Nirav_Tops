package assignment_corejava;

import java.util.Iterator;

public class A23_reverse_an_array_of_integer_values {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50,60};
	int b[] = new int[a.length];
	
	int count = 0;
	for (int i = a.length-1;i>=0;i--) 
	{
		b[count] = a[i];
		count++;
		
		System.out.println(a[i]);
	}
	
} 	
}