package assignment_corejava;

public class A7_Print_pattern_Given_Below {
public static void main(String[] args) {
	
	System.out.println("************"); //1
	
	int m = 5;
	
	for(int i=1;i<=m;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	System.out.println("************"); //2
	
	int n = 5;
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			int sum=i+j;
			if(sum%2==0) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
		System.out.println(" ");
	}
	
	System.out.println("*************"); //3
	
	int o = 4;
	
	for(int i=1;i<=o;i++) {
		for(int j=1;j<=o-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	System.out.println("*************"); //4
	
	int lines = 5;
	int starcount = 1;
	int spacecount = lines-1;
	int mid=(lines/2)+1;
	
	for(int j=1;j<=lines;j++)
	{
		for(int k=1;k<=spacecount;k++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<=starcount;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		if(j<mid)
		{
			starcount=starcount+2;
			spacecount--;
		}
		else
		{
			starcount=starcount-2;
			spacecount++;
		}
	}
	
	}
	
}

