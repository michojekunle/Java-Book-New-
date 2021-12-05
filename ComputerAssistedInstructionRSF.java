package ChapterSixExercises;

import java.util.Scanner;
import java.security.SecureRandom;
public class ComputerAssistedInstructionRSF 
{
	private static final SecureRandom randomNumbers= new SecureRandom();
	
	public static void main(String[] args)
	{
		int ans; 	
		Scanner sc = new Scanner(System.in);
		int inp;

		System.out.println("You're about to begin a Test Enter 1 to continue or 2 to Exit: ");
		inp = sc.nextInt();
		while (inp ==1) 
		{	
		askQuestion();
		
		System.out.println("Enter 1 to continue or 2 to exit: ");
		inp = sc.nextInt();
		}
		if (inp != 1)
			System.out.println("Exited the Test.");
	}
	
	public static void askQuestion()
	{
		Scanner sc = new Scanner(System.in);

			int x, y, ans ;
			
			x = randomNumbers.nextInt(9);
			y = randomNumbers.nextInt(9);
			
			System.out.println("How much is " + x + " times "+ y);
			ans = sc.nextInt();
			
			while(ans != x*y) 
			{			
				getWgComment();
				System.out.println();
				System.out.println("How much is " + x + " times "+ y);
				ans = sc.nextInt();
			}
			
			if (ans ==x*y)
			{
				getCoComment();
				System.out.println();
			}
	}		
	
	public static void getCoComment()
	{
		int numC = 1 + randomNumbers.nextInt(4);
		
		switch (numC)
		{
		case 1:
			System.out.println("Very good!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4: 
			System.out.println("Keep up the good work!");
			break;
		}
	}
	
	public static void getWgComment()
	{
		int numW = 1 + randomNumbers.nextInt(4);

		switch (numW)
		{
		case 1:
			System.out.println("No. Please try again.");
			break;
		case 2:
			System.out.println("Wrong. try once more.");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4: 
			System.out.println("No. Keep trying");
			break;
		}
	}
}