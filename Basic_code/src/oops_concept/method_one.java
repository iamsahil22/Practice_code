package oops_concept;

import java.util.Scanner;

public class method_one {

	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word");
		String x = s.next();
		text(s);
		//sum(f);
	}
	
	public static void text (Scanner s)
	{
		/*
		 * for(int x=0;x<=s.length();x++) { System.out.println("Your word length is :"
		 * +s); }
		 */
		System.out.println("Your word length is :" +s);
	}
	
	public int sum(int f)
	{
		f =25;
		return f;
	}

}
