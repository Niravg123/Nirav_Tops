package Opps;

class pen {
	
	static int price = 200;
	String company = "cello";
	String color = "red";

	public void towrite() {
		
		System.out.println(price+" "+company+" "+color);
	}

}

public class O001_FirstDemo {

public static void main(String[] args) {
		
	pen.price = 150;
	
		pen p = new pen();
		//p.price = 50;
		p.color = "black";
		p.towrite();
		
		pen p1 = new pen();
		//p1.price = 60;
		p1.color ="white";
		p1.towrite();
		
		pen p2 = new pen();
		//p2.price = 70;
		p2.color = "green";
		p2.towrite();
		
		
	}
}
