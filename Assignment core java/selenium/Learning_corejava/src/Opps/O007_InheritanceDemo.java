package Opps;

class A
{
	int id=10;
	String name="test";
	
	public void display()
	{
		System.out.println("Running class A display");
		System.out.println(id+" "+name);
	}
}

class B extends A
{
	String phno="8969857485";
	int id=50;
	public void show()
	{
		System.out.println("Running class B show");
		System.out.println(super.id+" "+name+" "+phno);
		System.out.println(id+" "+name+" "+phno);
	}
}

class C extends B
{
	String phno="8969857485";
	int id=100;
	public void show()
	{
		System.out.println("Running class B show");
		System.out.println(super.id+" "+name+" "+phno);
		System.out.println(id+" "+name+" "+phno);
	}
}


public class O007_InheritanceDemo {
public static void main(String[] args) {
	
	//A a = new A();
	
	//a.display();
	
	//B b = new B();
	
	//b.show();
	
	C c = new C();
	
	c.show();
}
}