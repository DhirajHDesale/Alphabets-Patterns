package practice;

public class Pattern22 {

	/*
	 
*****
   * 
  *  
 *   
*****



 
	 */
	
	public static void main(String[] args) {
		
		int row = 5;
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=row;j++) {
				if(i==1 || i+j==row+1 || i==row)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			
			System.out.println();
		}
		
	}
}
