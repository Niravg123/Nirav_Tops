package array;

public class A001_Arraydemo {

	public static void main(String[] args) {
		
		//declaration
		
		int a[] = new int[5];
		
		//initilaization
		
		a[0] = 10;
		a[1] = 20;
		
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("************");
		
		int b[] = {10,20,30,40,50,60,}; {
			
			for(int i=0;i<b.length;i++) {
				
				System.out.println(b[i]);
				
			}
		}
		
		
		System.out.println("***************");
		
		String subject[] = {"java","python","nord"}; {
			
			for(int i=0;i<subject.length;i++) {
				
				System.out.println(subject[i]);
			}
		}
		
		System.out.println("************************");
		
		char ch[] = {'a','b','c','d','e'}; {
			
			for(int i=0;i<ch.length;i++) {
				
				System.out.println(ch[i]);
			}
		}
		
		
		
}
}