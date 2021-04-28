package Java_Basics;

import java.util.*;
public class Random_number {

	public static void main(String[] args) {
		Random random = new Random(); // creating random object from Random class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter how many ranodm numbers you want");
		int x = sc.nextInt();
		
		for(int y=1;y<=x;y++) 
		{
			int a = random.nextInt(50);
			System.out.println("random number"+a);
		}
	}

}
