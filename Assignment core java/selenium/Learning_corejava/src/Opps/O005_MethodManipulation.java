package Opps;

class Calc
{
	public void print()
	{
		System.out.println("Running Print Method");
	}
	
	public void Square(int a)
	{
		int sq = a*a;
		System.out.println("Square is :"+sq);
	}
	
	public void add(int a , int b)
	{
		int ad = a+b;
		System.out.println("Addition is :"+ad);
	}
	
	public int cube(int a)
	{
		int cube = a*a*a;
		return cube;
		
	}
	
	public void String(String name)
	{
		String str = "nirav";
		System.out.println("String name is :"+str);
	}
	
	public void addarray(int a[])
	{
		int sum = 0;
		for(int i=0;i<=a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
}





public class O005_MethodManipulation {

public static void main(String[] args) {
	
	Calc c = new Calc();
	c.print();
	c.add(20, 30);
	c.String("nirav");
	c.Square(40);
	
	int cube = c.cube(10);
	System.out.println(cube);
	
	
	
}
}