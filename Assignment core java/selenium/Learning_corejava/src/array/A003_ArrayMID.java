package array;

public class A003_ArrayMID {

	public static void main(String[] args) {

		int a[][] = new int[3][5];
		
		a[0][0] = 41;		
		a[0][1] = 42;		
		a[0][2] = 43;		
		a[0][3] = 44;		
		a[0][4] = 45;		

		a[1][0] = 46;
		a[1][1] = 47;
		a[1][2] = 48;
		a[1][3] = 49;
		a[1][4] = 50;
		
		a[2][0] = 51;		
		a[2][1] = 52;		
		a[2][2] = 53;		
		a[2][3] = 54;		
		a[2][4] = 55;
		
		for(int i=0;i<3;i++) {
			
			for (int j=0;j<5;j++) {
				
				System.out.print(a[i][j]+" ");
			}
		}
		
		System.out.println();

		
		
		
		
		
	}
}
