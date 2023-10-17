package assignment_corejava;

public class A8_compute_the_sum_of_the_first_100_prime_numbers {
public static void main(String[] args) {
	
	
	int count = 0;
	int sum = 0;  
 
	for(int i=1; i<=100; i++)  
	{  
	count = 0;  
	for (int j=2; j<=i/2; j++)  
	{  
	if(i%j == 0)  
	{  
	count++;  
	break;  
	}  
	}  
	if(count == 0 && i!=1 )  
	{        
	sum = sum+i;  
	}     
	}  
	  System.out.println("The Sum of Prime Numbers is: " +sum); 
}
}
