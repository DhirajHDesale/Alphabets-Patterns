package practice;

public class Pattern22 {

	/*
	 
**** 
*   *
*   *
*   *
*   *
*   *
**** 
 
	 */
	public static void main(String[] args) {
	int size = 7;
	for(int i = 1;i<=size;i++) {
		for(int j = 1;j<=5;j++) {
			if(i==1 && j!=5 || j==1 || i==size && j!=5 || i==6 && j==5 || i==2 && j==5)
				System.out.print("*");
			else if(i==3 && j==5 || i==4 && j==5 || i==5 && j==5)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	}

}
