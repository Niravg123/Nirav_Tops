package Opps;

class P 
{
	public void print()
	{
		System.out.println("Running P class method");
	}
}
class Q extends P
{
	public void print()
	{
		System.out.println("Running Q class method");
	}
}
public class O009_Methodoverriding {
public static void main(String[] args) {
	
	//P p = new P();
	//p.print();
	
	Q q = new Q();
	q.print();
	
	
}
}
