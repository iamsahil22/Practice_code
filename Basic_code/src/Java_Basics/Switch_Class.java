package Java_Basics;

import java.util.*;
public class Switch_Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a character");
		
		char x = sc.next().charAt(0);
		
		switch(x)
		{
		
		case 'a': System.out.println("It's a vowel");
		break;
		
		case 'e': System.out.println("It's a vowel");
		break;
		
		case 'i' : System.out.println("It's a vowel");
		break;
		
		case 'o' : System.out.println("It's a vowel");
		break;
		
		case 'u' : System.out.println("It's a vowel");
		break;
		
		default : System.out.println("It's a character");
		
		}
		
		
		
	}
}
