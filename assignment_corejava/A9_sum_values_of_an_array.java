package assignment_corejava;

public class A9_sum_values_of_an_array {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50,60,70,80,90,100};
	int sum = 0;
	for(int i=0;i<a.length;i++) {
		sum = sum+a[i];
	}
		System.out.println("sum :"+sum);
}
}
