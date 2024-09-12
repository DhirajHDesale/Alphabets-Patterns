package practice;

public class Pattern22 {

	/*
	 
 ****
*    
*    
*    
 ****

	 */

	public static void main(String[] args) {
	int size = 5;
	for(int i = 1;i<=size;i++) {
		for(int j = 1;j<=size;j++) {
	if(i!=1 && j==1 && i!=5 && j==1)
		System.out.print("*");
	else if(i==1 && j==2 || i==1 && j==3 || i==1 && j==4 || i==1 && j==5)
System.out.print("*");
	else if(i==5 && j==2 || i==5 && j==3 || i==5 && j==4 || i==5 && j==5)
		System.out.print("*");
	else
		System.out.print(" ");
		
		}
		System.out.println();
	}
	}

}
