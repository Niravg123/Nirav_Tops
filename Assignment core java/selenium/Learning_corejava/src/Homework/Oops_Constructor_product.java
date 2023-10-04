package Homework;

class product {
	
	int pid;
	String pname;
	int price;
	
	product(int a, String b, int c) {
		
		pid=a;
		pname=b;
		price=c;
		
	}
	public void display() {
		
		System.out.println(pid+" "+pname+" "+price);
	}
}

public class Oops_Constructor_product {
	public static void main(String[] args) {
		
		product pro = new product(1,"dove",100);
		pro.display();
	}

}
