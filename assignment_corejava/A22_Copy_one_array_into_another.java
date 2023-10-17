package assignment_corejava;

public class A22_Copy_one_array_into_another {
public static void main(String[] args) {
	
	int  a[] = {10,20,30,40,50,60};
	int b[] = new int[a.length];
	
	for (int i = 0; i < b.length; i++) {
		
		b[i] = a[i];
	}
	
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
		
	}
}
}
