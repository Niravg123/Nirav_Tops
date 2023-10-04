package Opps;

public class O006_Encapsulation_Demo {

	public static void main(String[] args) {
		
	 Std std = new Std();
	 
	 std.setid(1);
	 std.setname("test");
	 std.setemail("test@gmail.com");
	 std.setphno(1234567890);
	 
	 System.out.println(std.getid()+" "+std.getname()+" "+std.getemail()+" "+std.getphno());
	 
	}
}
