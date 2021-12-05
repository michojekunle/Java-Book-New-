package ChapterSixExercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification 
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int guessI= 0 ,
		guessCal = 1 + randomNumbers.nextInt(5);
		int count = 1;
		
		System.out.println("if you want to guess a number enter 1"
				+ "\nif you don't want to guess enter 2");
		int ans = scan.nextInt();
	
		while (ans == 1) 
		{
			System.out.println("Guess a number between 1 and 5: ");
			guessI = scan.nextInt();

			while (count!= 0)
			{
				count++;
			}

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
		
		if (count <= 10 && guessI == guessCal)
			System.out.println("You Know the Secret");
		else 
			if (count == 10 && guessI == guessCal)
				System.out.println(" Aha! You Know the Secret!");
			else 
				if ((count > 10 && guessI == guessCal) || (count > 10 && guessI != guessCal))
					System.out.println("You should be able to do better! Why"
							+ "should it take no more than 10 guesses?");
	
		System.out.println("Application Terminated.");
	}
}