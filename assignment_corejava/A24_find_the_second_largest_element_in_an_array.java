package assignment_corejava;

import java.util.Iterator;

public class A24_find_the_second_largest_element_in_an_array {
public static void main(String[] args) {
	
	int a[] = {10,20,3,99,1,6,99,5,98};
	
	int max = a[0];
	int smax = a[0];
	
	for (int i = 0; i < a.length; i++) 
	{
		if (a[i]>max) 
		{
			smax = max;
			max = a[i];
		}
		else if(a[i]>smax || smax == max)
		{
			smax = a[i];
		}
	}
	
	System.out.println("max :"+max);
	System.out.println("smax :"+smax);
}
}
