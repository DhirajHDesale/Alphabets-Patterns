package practice;

public class Pattern22 {

	/*
	 
 *** 
*   *
*   *
*   *
 *** 

 
	 */
	
	public static void main(String[] args) {
	int row = 5;
	for(int i = 1;i<=row;i++) {
		for(int j = 1;j<=row;j++) {
			if(i!=1 && i!=5 && j==1 || i!=1 && i!=5 && j==row)
				System.out.print("*");
			else if(i==1 && j==2 || i==1 && j==3 || i==1 && j==4)
				System.out.print("*");
			else if(i==5 && j==2 || i==5 && j==3 || i==5 && j==4)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	
	}

}
