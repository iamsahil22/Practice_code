package Java_Basics;

import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Year");
		int x = sc.nextInt();
		
		
		int year = x%4;
		if (year==0)
		{
		System.out.println("Year is leap");
		}
		
		else
			System.out.println("Normal year"); // Ternary Operator
	}
}
