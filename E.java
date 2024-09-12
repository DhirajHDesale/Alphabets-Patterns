package practice;

public class Pattern22 {

	/*
	 
****
*
****
*
****

 
	 */
	public static void main(String[] args) {
	int row = 5;
	int col = 4;
	for(int i = 1;i<=row;i++) {
		for(int j = 1;j<=col;j++) {
			if(i==1 || j==1 || i==3 || i==row)
				System.out.print("*");
			
		}
		System.out.println();
	}
	
	}

}
