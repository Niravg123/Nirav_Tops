package assignment_corejava;

class T1 implements Runnable
{
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Th1 : "+i);
		}
		
	}
}

public class A17_create_one_thread_by_implementing_Runnable_interface_in_Class {
public static void main(String[] args) {

	T1 t1 = new T1();
	
	Thread th1 = new Thread(t1);
	
	th1.start();
}

}
	
