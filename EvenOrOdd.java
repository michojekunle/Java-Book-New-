package ChapterSixExercises;

import java.util.Scanner;
public class EvenOrOdd 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		while (sc.hasNext())
		{
			int num = sc.nextInt();
			System.out.println(isEven(num));
			
			System.out.println();
			System.out.println("Enter The Next Number: ");			
		}
		System.out.println("Application ended");
	}
	
	public static int isEven(int num)
	{
		if (num % 2 == 0)
			System.out.println("The number "+ num +" is it an even number? Answer: " + true + "\nThe Number " + num + " is an Even Number.");
		else
			System.out.println("The number "+ num +" is it an even number? Answer: "+ false + "\nThe Number " + num + " is an Odd Number.");
		int count = 0;
		
		return count;
	}
}
