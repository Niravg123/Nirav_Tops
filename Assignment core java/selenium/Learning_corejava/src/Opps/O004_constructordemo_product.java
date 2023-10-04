package Opps;

class product {
	
	int id;
	int price;
	int qty;
	String name;
	String company;
	
	

	public product(int id, int price, int qty, String name, String company) {
		super();
		this.id = id;
		this.price = price;
		this.qty = qty;
		this.name = name;
		this.company = company;
	}
	
	public void display() {
		
		System.out.println(id+" "+price+" "+qty+" "+name+" "+company);
	}
	
}





public class O004_constructordemo_product {
public static void main(String[] args) {
	
	product p = new product(1,50,10,"fan","cello");
	p.display();
	product p1 = new product(2,100,20,"tubelight","Havels");
	p1.display();
}
}
