package Java_Basics;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int age;
		
		System.out.println("Please enter your age");
		
		age =s.nextInt();
		
		if (age<18)
		{
			System.out.println("The user is minor");
		}
		else
			System.out.println("User can apply for the passport");

	}

}
