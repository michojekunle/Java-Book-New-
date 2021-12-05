package ChapterSixExercises;

import java.util.Scanner;
import java.security.SecureRandom;
public class ComputerAssistedInstruction 
{
	private static final SecureRandom randomNumbers= new SecureRandom();
	
	public static void main(String[] args)
	{
		int ans; 	
		
		askQuestion();
		System.out.println();
		
	}
	
	public static void askQuestion()
	{
		Scanner sc = new Scanner(System.in);
		int inp;

		System.out.println("You're about to begin a Test Enter 1 to continue or 2 to Exit: ");
		inp = sc.nextInt();

		while (inp ==1) 
		{
			int x, y, ans ;
			
			x = randomNumbers.nextInt(9);
			y = randomNumbers.nextInt(9);
			
			System.out.println("How much is " + x + " times "+ y);
			ans = sc.nextInt();
			
			while(ans != x*y) 
			{
				System.out.println("No. Please try again.");
				System.out.println();
				System.out.println("How much is " + x + " times "+ y);
				ans = sc.nextInt();
			}
			
			if (ans ==x*y)
			{
				System.out.println("Very good ");
				System.out.println();
			}
						
			System.out.println("Enter 1 to continue or 2 to exit: ");
			inp = sc.nextInt();
		}
		if (inp == 2)
			System.out.println("Exited the Test.");
	}
}
