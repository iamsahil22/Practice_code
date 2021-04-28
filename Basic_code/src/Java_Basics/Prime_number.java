package Java_Basics;

import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter a Number");
	int x = input.nextInt();
	int flag=0;
	int z = x/2;
	if(x==0 || x==1)
		
	{
		System.out.println(x+"This is a not a prime number");
	}
	else
		
	{
		
		for(int i=2;i<=z;i++)
		{
			if(x%i==0)
			{
				System.out.println(x+"not a prime number");
				flag=1;
				break;
			}
		}
		
		if (flag==0)
		{
			System.out.println(x+ ": It's a prime number");
		}
		
		}
		
	}
		
	}


