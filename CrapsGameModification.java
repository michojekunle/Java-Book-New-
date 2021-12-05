package ChapterSixExercises;
// Craps class simulates the dice game craps.
import java.security.SecureRandom;
import java.util.Scanner;
public class CrapsGameModification 
{
	// create secure random number generator for use in method rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// enum type with constants that represents the game status 
	private enum Status { CONTINUE, WON, LOST };
	
	// constants that represents common rolls of the dice 
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	private static  int BANK_BALANCE = 1000;

	// plays one game of craps 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a wager: ");
			int wager = sc.nextInt();
			
			while (wager > BANK_BALANCE)
				{
				System.out.println("Invalid input Enter a wager less than 1000 :");
				wager = sc.nextInt();
				}
		
			System.out.println("Choose: \n1. Enter 1 If you want to play a game of craps"
				+ "\n2. Otherwise Enter 0 to Exit");
			int ans = sc.nextInt();
		
		while (ans == 1) 
		{
			
			int myPoint = 0; // point if no win or loss on first roll
			Status gameStatus; // can contain CONTINUE, WON or LOST
			
			int sumOfDice = rollDice(); // first roll of the dice 
			
			//determine game status and point based on first roll 
			switch (sumOfDice) 
			 {
				 case SEVEN: // win with 7 on first roll 
				 case YO_LEVEN: // win with 11 on first roll
					 gameStatus = Status.WON;
					 break;
				 case SNAKE_EYES: // lose with 2 on first roll
				 case TREY: // lose with 3 on first roll 
				 case BOX_CARS: // lose with 12 on first roll 
					gameStatus = Status.LOST;
				 	break;
				 default: // did not win or lose, so remember point
					 gameStatus = Status.CONTINUE; // game is not over
					 myPoint = sumOfDice; // remember the point
					 System.out.printf("Point is %d%n", myPoint);
					 break; 
			}
			
			 // while game is not complete
			 while (gameStatus == Status.CONTINUE) // not WON or LOST
			 { 
				 sumOfDice = rollDice(); // roll dice again
			
				 // determine game status
				 if (sumOfDice == myPoint) // win by making point
					 gameStatus = Status.WON;
				else
					if (sumOfDice == SEVEN) // lose by rolling 7 before point
						gameStatus = Status.LOST;
			}
			
			 // Display won or lost message
			  if (gameStatus == Status.WON)
			  {
				  System.out.println("Player wins");
				  BANK_BALANCE = BANK_BALANCE + wager ;
				  System.out.println("New BANK_BALANCE = " + BANK_BALANCE);
				  
			  }
			  else 
			  {
				  System.out.println("Player loses");
				  BANK_BALANCE = BANK_BALANCE - wager;
				  System.out.println("New BANK_BALANCE = " + BANK_BALANCE);
				  
			  }
			 
			  // Computer Chatter
			  System.out.println(chatter(BANK_BALANCE));
			  
				if (BANK_BALANCE <= 0) 
				{
					  System.out.println("Sorry. You are busted!. \nEnter zero to quit Craps Game.");
					  
				}
				else System.out.println("Want to cotinue Enter 1 otherwise Enter 0 ");
				 ans = sc.nextInt();  
		}
		System.out.println("Exited craps game.");
	} 
		 
		 // roll dice, calculate sum and display results
		 public static int rollDice()
		 {
			 // pick random die values
			  int die1 = 1 + randomNumbers.nextInt(6); // first die roll
			  int die2 = 1 + randomNumbers.nextInt(6); // second die roll
			 
			  int sum = die1 + die2; // sum of die values
			 
			  // display results of this roll
			  System.out.printf("Player rolled %d + %d = %d%n", 
				die1, die2, sum);
			  
			  return sum; 
		  
	} 
		 public static int chatter( int bankBalance)
		 {
			 int  balance = bankBalance;
			 if (bankBalance <= 100)
				 System.out.println("Oh! you're going for a broke, huh?");
			 else
				 if (bankBalance < 300)
					 System.out.println("Aw c'mon, take a chance!");
				 else
					 if (bankBalance > 1300)
						 System.out.println("You're up big. Now's the time to cash in your chips!");
					 else
						 if (bankBalance < 400 && bankBalance >= 300)
							 System.out.println(" Try better. You can can do it. ");		 
			 return balance;
		 }
} // end class Craps