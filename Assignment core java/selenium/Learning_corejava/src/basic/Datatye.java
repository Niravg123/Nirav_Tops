package basic;

public class Datatye {
public static void main(String[] args) {
	
	//widning - implisite
	
	int a = 10; //4 byte	
	long b = a; //8 byte
	System.out.println(a);
	
	//nerrowing - explicite
	
	long i = 32769; //8 byte
	int j = (int) i; // 4 byte
	//System.out.println(j);
	
	int k = 'c';
	System.out.println(k);
	
	char c = 40;
	System.out.println(c);

	
	

} 	
}
