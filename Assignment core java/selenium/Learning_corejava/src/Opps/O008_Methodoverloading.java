package Opps;

class sample
{
	public void getdata() 
	{
		System.out.println("Blank method called");
	}
	public void getdata(String name)
	{
		System.out.println("name");
	}
	public void getdata(int id)
	{
		System.out.println(id);
	}
	public void getdata(int id,String name)
	{
		System.out.println(id+" "+name);
	}
	
}
public class O008_Methodoverloading {

	public static void main(String[] args) {
		
		sample s = new sample();
		s.getdata();
		s.getdata("nirav");
		s.getdata(10);
		s.getdata(10,"nirav");
		
		
	}
}