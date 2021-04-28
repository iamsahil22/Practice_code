package Java_Basics;

import java.util.*;
public class Switch_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		
		switch(m) {
		
		case 1 : System.out.println("This is first month : January");
		break;
		
		case 2 : System.out.println("This is first month : february");
		break;
		
		case 3 : System.out.println("This is first month : March");
		break;
		
		case 4 : System.out.println("This is first month : April");
		break;
		
		case 5 : System.out.println("This is first month : May");
		break;
		
		case 6 : System.out.println("This is first month : June");
		break;
		
		case 7 : System.out.println("This is first month : July");
		break;
		
		case 8 : System.out.println("This is first month : August");
		break;
		
		case 9 : System.out.println("This is first month : September");
		break;
		
		case 10 : System.out.println("This is first month : October");
		break;
		
		case 11 : System.out.println("This is first month : November");
		break;
		
		case 12 : System.out.println("This is first month : December");
		break;
		
		default : System.out.println("Invalid Input");
		}
		
	}

}
