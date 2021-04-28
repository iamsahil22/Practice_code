package oops_concept;

import java.util.*;
public class methodCalling {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();	
		evenOdd(num);
	}

	public static void evenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+ "is an even number");
		}
		else
			System.out.println(num+ "is an odd number");
		
	}
	
}
