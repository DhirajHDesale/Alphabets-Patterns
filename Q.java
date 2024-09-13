package practice;

public class Pattern22 {

	/*
	 
 *** 
*   *
*   *
*   *
**  *
 *** 
    *


 
	 */
	
	public static void main(String[] args) {
		
		int row = 7;
		int col = 5;
		
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=col;j++) {
				if(i!=1 && i!=6 && i!=7 && j==1 || i!=1 && i!=6 && i!=7 && j==col)
					System.out.print("*");
				else if(i==1 && j==2 || i==1 && j==3 || i==1 && j==4)
					System.out.print("*");
				else if(i==6 && j==2 || i==6 && j==3 || i==6 && j==4)
					System.out.print("*");
				else if(i==5 && j==2 || i==row && j==col)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	
	}

}
