package Homework;


class print {
	
	public void sub(int a,int b)
	{
		int result = a-b;
		System.out.println("Subtaction is :"+result);
	}
	
	public void mul(int a,int b)

{
		int result = a;
		System.out.println("multipication is :"+result);
}
	public int div(int a,int b)
	{
		int numer = a;
		return numer;
	}

}


public class Oops_methodmainpulation {
public static void main(String[] args) {
	
	
	
	print p = new print();
	p.sub(50, 30);
	p.mul(20, 30);
	
	int c = p.div(100,30);
	
	System.out.println(c);

	
}
	
}
