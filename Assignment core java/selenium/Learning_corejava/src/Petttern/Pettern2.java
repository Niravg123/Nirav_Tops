package Petttern;

public class Pettern2 {
public static void main(String[] args) {
	
	int lines = 5;
	int Starcount = 1;
	int Spacecount = lines-1;
	
	for(int j=1;j<=lines;j++)
	{
		for(int i=1;i<=Spacecount;i++)
		{
			System.out.print(" ");
		}
		
		for(int i=1;i<=Starcount;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		Starcount++;
		Spacecount--;
	}
}
}