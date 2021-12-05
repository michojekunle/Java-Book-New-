package ChapterSixExercises;

import java.util.Scanner;
import java.security.SecureRandom;
public class CAIMonitoringStudentPerformance
{
	private static final SecureRandom randomNumbers= new SecureRandom();
	
	public static void main(String[] args)
	{
		int ans; 	
		Scanner sc = new Scanner(System.in);
		
		askQuestion();
				
	}
	
	public static void askQuestion()
	{
		Scanner sc = new Scanner(System.in);
		int inp;

		int x, y, ans, count = 1, numCorrect = 0, numWrong = 0, total = 0, percentCorrect ;

		System.out.println("You're about to begin a Test Enter 1 to continue or 0 to Exit: ");
		inp = sc.nextInt();
		
		while (inp ==1) 
		{		
			x = randomNumbers.nextInt(9);
			y = randomNumbers.nextInt(9);
			
			System.out.println("How much is " + x + " times "+ y);
			ans = sc.nextInt();
			
			while(ans != x*y) 
			{			
				getWgComment();
				numWrong++;
				System.out.println();
				System.out.println("How much is " + x + " times "+ y);
				ans = sc.nextInt();
			}
			
			if (ans ==x*y)
			{
				getCoComment();
				numCorrect++;
				System.out.println();
			}
			total = numCorrect + numWrong;
			count ++;
			if (count == 10)
			{
				percentCorrect = numCorrect/total * 100;
				if (percentCorrect < 75)
					System.out.println("Please ask your teacher for extra help.\nAllow the next student to play. Enter 0");
				else 
					if (percentCorrect>=75)
						System.out.println("Congratulations, you are ready to got to the next level!\nAllow the next student to play. Enter 0");
				inp = 2;
			}
			System.out.println("Enter 1 to continue or 0 to exit: ");
			inp = sc.nextInt();

		}
			if (inp == 0)
				System.out.println("Exited the Test.");
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