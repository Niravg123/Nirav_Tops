package Homework;

public class usernamepasswordarray {

	public static void main(String[] args) {
		
		String a[][] = {{"u1","p1"},{"u2","p2"},{"u3","p3"},{"u4","p4"}};
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]+"  ");
			}
			System.out.println();
		}
}
}