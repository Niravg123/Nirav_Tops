package assignment_corejava;

public class A10_calculate_the_average_value_of_array_elements {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50,60,70,80,90,100};
	int sum = 0;
	for(int i=0;i<a.length;i++) {
		sum = sum+a[i];
	}
		System.out.println("sum :"+sum);
		System.out.println("avg :"+(sum/a.length));
	
}
}
