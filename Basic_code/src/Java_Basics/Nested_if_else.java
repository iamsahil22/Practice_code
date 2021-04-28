package Java_Basics;

import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
		
		System.out.println("Enter the marks for Hindi");
		Scanner inp1= new Scanner(System.in);
		double x = inp1.nextDouble();
		
		System.out.println("Enter the marks for English");
		Scanner inp2= new Scanner(System.in);
		double x1 = inp2.nextDouble();
		
		System.out.println("Enter the marks for Science");
		Scanner inp3= new Scanner(System.in);
		double x2 = inp3.nextDouble();
		
		System.out.println("Enter the marks for SST");
		Scanner inp4= new Scanner(System.in);
		double x3 = inp4.nextDouble();
		
		System.out.println("Enter the marks for Maths");
		Scanner inp5= new Scanner(System.in);
		double x4 = inp5.nextDouble();
		
		double avg;
		
		avg = (x+x1+x2+x3+x4)/5;
		System.out.println("Average marks are"+avg);
		
		if(avg<33)
		{
			System.out.println("The student is failed");
			
		}
		
		else if (avg>33 && avg<60)
		{
			System.out.println("Student is passed");
		}
		
		else if(avg>60 && avg<90)
		{
			System.out.println("Student has first division marks");
		}
		
		else
		{
			System.out.println("Student has above 90% marks");
		}
		
		
		
	}
	
}
