package assignment_corejava;

public class A11_find_the_index_of_an_array_element {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50,60};
	
	int num = 30;
	
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]==num)
		{
			System.out.println(i);
		}
		
	}
	
}   
}



