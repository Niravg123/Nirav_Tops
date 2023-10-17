package assignment_corejava;

public class A12_find_the_maximum_and_minimum_value_of_an_array {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50,60,70,80,90,100};
	
	int max = a[0];
	int min = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
		if(a[i]<min) {
			min =a[i];
		}
		
	}
		
	System.out.println("max :"+max);
	System.out.println("min :"+min);	
}
}
