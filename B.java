package practice;

public class Pattern22 {

	/*
	 
 
**** 
*   *
**** 
*   *
**** 

	 */

	public static void main(String[] args) {
	int size = 5;
	for(int i = 1;i<=size;i++) {
		for(int j = 1;j<=size;j++) {
			if(i==1 && j!=size || j==1 || i==3 && j!=size)
				System.out.print("*");
			else if(i==2 && j==size || i==4 && j==size || i==5 && j!=size)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	}

}
