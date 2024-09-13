package practice;

public class Y {

	/*
	 
*       *
 *     * 
  *   *  
   * *   
    *    
    *
    *
    *
    *
    *


 
	 */
	
	public static void main(String[] args) {
		
		int row = 5;
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=row;j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			for(int j = 2;j<=row;j++) {
				if(i+j==row+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		for(int i = 1;i<=row;i++) 
		{
			for(int j = 1;j<row;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=row;j++) {
				if(j==1)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
