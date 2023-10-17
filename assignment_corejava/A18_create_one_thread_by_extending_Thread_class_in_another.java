package assignment_corejava;

class th1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("th1 :"+i);
		}
	}
}
class th2 extends th1
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Th2 :"+i);
		}
	}
}


public class A18_create_one_thread_by_extending_Thread_class_in_another {

	public static void main(String[] args) {
	
		
		th1 t1 = new th1();
		th2 t2 = new th2();
		
		//t1.start();
		t2.start();
		

		
		
}
}
