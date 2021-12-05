package ChapterSixExercises;

import java.security.SecureRandom;
import java.util.Scanner;
public class CoinTossing 
{
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status {HEAD, TAIL};
	
	public static void main(String[] args) 
	{
	 	flip();
	}

	public static void flip()
	{
		Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Choose Either to:\n1. Toss Coin (ENTER 1) \n2. EXIT (ENTER 0)");
		 int userInput = scan.nextInt();
		 
		 if (userInput == 1)
		 { 
				int countH = 0, countT = 0, countHandT= 0, coinResult;
				 Status coinStatus;
			while (userInput == 1)
			{
			    coinResult = 1 + randomNumbers.nextInt(2);
	
				 if (coinResult == 1)
					 {
					 coinStatus = Status.HEAD;
					 countH = countH + 1;
					 }
				 
				 if (coinResult == 2)
				 {
				 coinStatus = Status.TAIL;
				 countT = countT + 1;
				 }
				 countHandT = countH + countT;
				 
				 System.out.println("All heads counted = " + countH);
				 System.out.println("All tails counted = " + countT);
				 System.out.println();
				 System.out.println("Total times coin was tossed: " + countHandT);
				 System.out.println();
				 
				 System.out.println("Choose Either to:\n1. Toss Coin (ENTER 1) \n2. EXIT (ENTER 0)");
			     userInput = scan.nextInt();
			     
			     if (userInput == 0 || userInput > 1 )
					 System.out.println("EXITED COIN TOSSING PROGRAM");
			}
		 }else 
			 if (userInput == 0 || userInput > 1 )
				 System.out.println("EXITED COIN TOSSING PROGRAM");
	}
}
