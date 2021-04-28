package Java_Basics;
import java.util.Scanner;

public class Atm_code_with_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int amount = 99999;
		int withdraw, deposit;
		int pin = 2345;
		int p;
		
		while(true)
		{
		System.out.println("Press 1 for balance enquiry");
		System.out.println("press 2 for the cash withdraw");
		System.out.println("Press 3 for the deposit");
		//System.out.println("");
		int ch = sc.nextInt();
		System.out.println("Please enter your pin to proceed further");
		p =sc.nextInt();
			while(p!=pin)
			{
				System.out.println("\nINCORRECT PIN. TRY AGAIN.");
				System.out.print("ENTER YOUR PIN: ");
				p= sc.nextInt();
			}
		
		switch(ch)
			{
						
				case 1: System.out.println("Available balance is :"+amount);
				break;
				
				
				case 2: System.out.println("Please enter the amount for the withdrawl");
					withdraw = sc.nextInt();
					if(amount>withdraw)
				{
						
					amount = amount - withdraw;
					System.out.println("Please collect your cash: "+withdraw);
					System.out.println("Your available balance: "+amount);
				}
					else {
					System.out.println("insufficient balance");
					}
					System.out.println("");
				break;
				
				case 3: System.out.println("Please enter the amount for the deposit");
				deposit = sc.nextInt();
				amount = amount+ deposit;
				System.out.println("Your available balance is :"+amount);
			}
		}
	
	}
}
