package Statements;

public class S001_IF_Else {
	
	public static void main(String[] args) {
		
		int a = 450;
		int b = 300;
		int c = 400;
		
	//	if(a>b)
	//	{
	//		if(a>c) {
	//			System.out.println("a is greator");
	//		}
	//		else
	//		{
	//			System.out.println("c is greator");
	//		}
	//	}
	//	else 
	//	{
	//		if(b>c) {
	//			System.out.println("b is greator");
	//		}
	//		{
	//			System.out.println("c is greator");
	//		}
	//	}
	
		if(a>b && a>c)
		{
			System.out.println("a is greator"); //answer = a is greator
		} 
		else if(b>a && b>c)
		{
			System.out.println("b is greator");
		}
			else if(c>a && c>b) 
			{
				System.out.println("c is greator");
			}
	}
}
