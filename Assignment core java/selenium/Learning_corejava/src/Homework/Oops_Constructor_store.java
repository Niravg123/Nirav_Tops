package Homework;

class store {
	
	int id;
	int qty;
	int price;
	String name;
	String company;
	
	public store(int id, int qty, int price, String name, String company) {
		super();
		this.id = id;
		this.qty = qty;
		this.price = price;
		this.name = name;
		this.company = company;
	}
	
	public void display() {
		
		System.out.println(id+" "+qty+" "+price+" "+name+" "+company);
	}
	
	
}

public class Oops_Constructor_store {
public static void main(String[] args) {
	
	
	store s = new store(1,10,5,"cadbury","dairymilk");
	
	s.display();
	
	store s1 = new store(2,20,10,"5star","dairymilk");
	
	s1.display();
	
}
}
