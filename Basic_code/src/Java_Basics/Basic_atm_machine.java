package Java_Basics;

import java.util.*;
public class Basic_atm_machine {

	
	
	public static void main(String[] args) {
	
		
		Scanner n = new Scanner(System.in);
		Scanner p = new Scanner(System.in);
		Scanner at = new Scanner(System.in);
		
		System.out.println("Please Enter your name");
		String name = n.toString();
		
		System.out.println("Please enter your pin");
		int pi = 2884;
		int pin	=p.nextInt(); 
		int z=0;
		if (pi != pin)
		{
			System.out.println("Invalid pin ");
		}
		
		int am = 100000;
		System.out.println("Please enter the amount to withdraw");
		int amt = at.nextInt();
		
		if (amt>am)
		{
			System.out.println("Not sufficient balance");
		}
		else
		 z = am-amt;
		System.out.println("Your available balance"+z);
		
	}
	
}
