package practice;

public class Pattern22 {

	/*
	 
*****
  *  
  *  
  *  
  *  
  *  
  *  
 
	 */
	
	public static void main(String[] args) {
		
		int row = 7;
		int col = 5;
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=col;j++) {
				if(i==1 || j==3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
