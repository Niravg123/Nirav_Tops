package Petttern;

public class Pettern1 {
public static void main(String[] args) {
	
	int lines = 5;
	int starcount = 1;
	
	for(int j=1;j<=lines;j++)
	{
		for(int i=1;i<=starcount;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		starcount++;
	}
}
}
