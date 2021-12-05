package ChapterSixExercises;

import java.security.SecureRandom;
import java.util.Scanner;
public class GuessTheNumber 
{
	
	SecureRandom randomNumbers = new SecureRandom();
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		int guessI ,
		guessCal = 1 + randomNumbers.nextInt(1000);   
		System.out.println("if you want to guess a number enter 1"
				+ "\nif you don't want to guess enter 2");
		int ans = scan.nextInt();
	
		while (ans == 1) 
		{
			System.out.println("Guess a number between 1 and 1000: ");
			guessI = scan.nextInt();
			
			if (guessI == guessCal )
				System.out.println("Congratulations.");
			else 
				if (guessI != guessCal  && guessI < guessCal)
					System.out.println("Too low, Try Again");
				else 
					if (guessI != guessCal  && guessI > guessCal)
						System.out.println("Too High, Try Again");
			System.out.println();
			
			System.out.println("Want to Guess again: enter 1 if not enter 3");
			ans = scan.nextInt();
			
			
		}
		System.out.println("Application Terminated.");
	}

	public static void guessTheNumber()
	{
		
	}
}
