package practice;

public class Pattern22 {

	/*
	 
*  *  *
* * * *
**   **
*     *
 
	 */
	
	public static void main(String[] args) {
		
		int row = 4;
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=row;j++) {
				if(j==1 || i+j==row+1)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			for(int j = 2;j<=row;j++) {
				if(i==j || j==row)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
