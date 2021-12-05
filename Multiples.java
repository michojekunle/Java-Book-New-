package ChapterSixExercises;

import java.util.Scanner;

public class Multiples 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		// prompt user to enter pairs of data number and multiple
		System.out.println("Enter the digit of numbers to be printed");
		
		while (scan.hasNext())
		{
			System.out.println("Enter the next set of numbers: ");

			int num1 = scan.nextInt();
			
			int num2 = scan.nextInt();
			
			System.out.println("Checking whether "+ num2 + " is a multiple of " + num1 + " or not: ");
			System.out.print(isMultiple(num1,num2));
			System.out.println();
			System.out.println();
						
		}
		System.out.println("Application Terminated");
	}
	
	public static boolean isMultiple(int num1, int num2)
	{
		if (num2 % num1 == 0)
			System.out.println(true);
		else 
			System.out.println(false);
		boolean answer = true;
		System.out.println("The Above Answer is: "); 
		
		return answer;
	}
}