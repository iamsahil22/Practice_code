package Java_Basics;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		int y=1;
		
		System.out.println("Enter the Number till you want the fibonaci series");
		int num = sc.nextInt();
		System.out.print(""+x+""+y);
		for(int i =2;i<=num;++i)
		{
			int z =x+y;
			System.out.println(""+z);
			x=y;
			y=z;
		}
		
	}

}
