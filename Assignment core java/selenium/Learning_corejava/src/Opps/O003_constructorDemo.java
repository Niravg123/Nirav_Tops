package Opps;

class employee {
	
	int id;
	String name;
	double sal;
	
	employee() {
		System.out.println("constructor calling");
	}
	
	employee(String name) {
		System.out.println ("name is :"+name);
	}
	
	employee(int id) {
		System.out.println("id is :"+id);
	}
	
	employee(double sal) {
		System.out.println("sal is :"+sal);
	}
	
	employee(int a,String b,double c) {
		id = a;
		name = b;
		sal =c;
	}
	public void display() {
		System.out.println(id+" "+name+" "+sal);
	}
	
	
}


public class O003_constructorDemo {

	public static void main(String[] args) {
		
		
		//employee em = new employee();
		//employee em1 = new employee("tops");
		//employee em2 = new employee(10.66);
		
		employee emp = new employee (10,"tops",23.66);
		emp.display();
		
		employee emp1 = new employee (20,"tops",450.66);
		emp1.display();
	}
}
