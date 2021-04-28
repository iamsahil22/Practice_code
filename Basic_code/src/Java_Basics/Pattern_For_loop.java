package Java_Basics;

import java.util.*;
public class Pattern_For_loop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int i = s.nextInt();
		int j;
		int x =5;
		/*
		 * for(i=0;i<=5;i++) { for(j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
		
		/*
		 * for(i=1;i<=x;i++) { for(j=x;j>=i;j--) { System.out.print("*"); }
		 * System.out.println(); }
		 */
	
		for (j=1;j<i;j++)
		{
			System.out.print(j);
		}
		
	}

}
