package array;

public class A003_ArrayMID_practice_19923 {
public static void main(String[] args) {
	
	int a[][] = new int[3][5];
	
	a[0][0] = 40;
	a[0][1] = 41;
	a[0][2] = 42;
	a[0][3] = 43;
	a[0][4] = 44;
	
	a[1][0] = 45;
	a[1][1] = 46;
	a[1][2] = 47;
	a[1][3] = 48;
	a[1][4] = 49;
	
	a[2][0] = 50;
	a[2][1] = 51;
	a[2][2] = 52;
	a[2][3] = 53;
	a[2][4] = 54;
	
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<5;j++) {
			
			System.out.print(a[i][j]+" ");
		}
		
		System.out.println();
	}
		
}	
	
}
