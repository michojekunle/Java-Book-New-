package ChapterSixExercises;

import java.util.Scanner;
import java.security.SecureRandom;
public class CAIVaryingTheTypesOfProblems
{
	private static final SecureRandom randomNumbers= new SecureRandom();
	
	public static void main(String[] args)
	{
		int ans; 	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you area of practice:\n"
				+ "1. Addition\n2. Subtraction\n3. Multiplication\n"
				+ "4. Division\n5. Random mixture of all these types");
		int input = sc.nextInt();
		if(input == 1) {
			while (input ==1)
			askQuestionA();
			}
		else 
			if(input==2)
			{
				while(input ==2) 
				askQuestionS();
			}
			else 
				if (input==3) 
				{
					while (input == 3)
					askQuestionM();
				}
					
				else
					if (input==4)
						{
						while(input == 4)
						askQuestionD();
						}
					else
						if (input==5)
							{
							while(input == 5)
							askQuestionR();
							}
				
	}
	
	public static void askQuestionM()
	{
		Scanner sc = new Scanner(System.in);
		int inp;

		int x, y, ans, count = 1, numCorrect = 0, numWrong = 0, total = 0, percentCorrect ;

		System.out.println("You're about to begin a Test Choose your difficulty level\n"
				+ "1. Multiplying one digit numbers i.e. 6 * 7\n"
				+ "2. Multiplying two digit numbers i.e. 16 * 17\n"
				+ "3. Multiplying three digit numbers i.e. 126 * 127\n"
				+ "4. Or enter 0 to exit ");
		inp = sc.nextInt();
	if (inp ==1)
	{
		System.out.println("Welcome to one-digit multiplication. Enter 1 to continue.");
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
	if (inp == 2) 
	{
		System.out.println("Welcome to two-digit multiplication. Enter 2 to continue.");
		inp = sc.nextInt();
	
		while (inp ==2) 
		{		
			x = 10 + randomNumbers.nextInt(99);
				y = 10 + randomNumbers.nextInt(99);
				
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
			
		if (inp == 3) 
		{
			System.out.println("Welcome to three-digit multiplication. Enter 3 to continue.");
			inp = sc.nextInt();
		
			while (inp ==3) 
			{		
					x = 100 + randomNumbers.nextInt(999);
					y = 100 + randomNumbers.nextInt(999);
					
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
					System.out.println("Enter 1 to continue or 2 to exit and ten to move to the next: ");
					inp = sc.nextInt();
					
					if (inp == 10)
						break;
				}
				if (inp == 0)
					System.out.println("Exited the Test.");
				
		}
	}		
	
	public static void askQuestionA()
	{
		Scanner sc = new Scanner(System.in);
		int inp;

		int x, y, ans, count = 1, numCorrect = 0, numWrong = 0, total = 0, percentCorrect ;

		System.out.println("You're about to begin a Test Choose your difficulty level\n"
				+ "1. Addition one digit numbers i.e. 6 + 7\n"
				+ "2. Addition two digit numbers i.e. 16 + 17\n"
				+ "3. Addition three digit numbers i.e. 126 + 127\n"
				+ "4. Or enter 0 to exit ");
		inp = sc.nextInt();
	if (inp ==1)
	{
		System.out.println("Welcome to one-digit addition. Enter 1 to continue.");
		inp = sc.nextInt();
		while (inp ==1) 
		{		
			x = randomNumbers.nextInt(9);
			y = randomNumbers.nextInt(9);
			
			System.out.println("How much is " + x + " times "+ y);
			ans = sc.nextInt();
			
			while(ans != x+y) 
			{			
				getWgComment();
				numWrong++;
				System.out.println();
				System.out.println("How much is " + x + " plus "+ y);
				ans = sc.nextInt();
			}
			
			if (ans ==x+y)
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
	if (inp == 2) 
	{
		System.out.println("Welcome to two-digit addition. Enter 2 to continue.");
		inp = sc.nextInt();
	
		while (inp ==2) 
		{		
			x = 10 + randomNumbers.nextInt(99);
			y = 10 + randomNumbers.nextInt(99);
				
				System.out.println("How much is " + x + " plus "+ y);
				ans = sc.nextInt();
				
				while(ans != x+y) 
				{			
					getWgComment();
					numWrong++;
					System.out.println();
					System.out.println("How much is " + x + " plus "+ y);
					ans = sc.nextInt();
				}
				
				if (ans ==x+y)
				{
					getCoComment();
					numCorrect++;
					System.out.println();
				}
				total = numCorrect + numWrong;
				count++;
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
			
		if (inp == 3) 
		{
			System.out.println("Welcome to three-digit addition. Enter 3 to continue.");
			inp = sc.nextInt();
		
			while (inp ==3) 
			{		
					x = 100 + randomNumbers.nextInt(999);
					y = 100 + randomNumbers.nextInt(999);
					
					System.out.println("How much is " + x + " plus "+ y);
					ans = sc.nextInt();
					
					while(ans != x+y) 
					{			
						getWgComment();
						numWrong++;
						System.out.println();
						System.out.println("How much is " + x + " plus "+ y);
						ans = sc.nextInt();
					}
					
					if (ans ==x+y)
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
	}		

	public static void askQuestionS()
	{
		Scanner sc = new Scanner(System.in);
		int inp;

		int x, y, ans, count = 1, numCorrect = 0, numWrong = 0, total = 0, percentCorrect ;

		System.out.println("You're about to begin a Test Choose your difficulty level\n"
				+ "1. Subtracting one digit numbers i.e. 6 - 7\n"
				+ "2. Subtracting two digit numbers i.e. 16 - 17\n"
				+ "3. Subtracting three digit numbers i.e. 126 - 127\n"
				+ "4. Or enter 0 to exit ");
		inp = sc.nextInt();
	if (inp ==1)
	{
		System.out.println("Welcome to one-digit subtraction. Enter 1 to continue.");
		inp = sc.nextInt();
		while (inp ==1) 
		{		
			x = randomNumbers.nextInt(9);
			y = randomNumbers.nextInt(9);
			
			System.out.println("How much is " + x + " minus "+ y);
			ans = sc.nextInt();
			
			while(ans != x-y) 
			{			
				getWgComment();
				numWrong++;
				System.out.println();
				System.out.println("How much is " + x + " minus "+ y);
				ans = sc.nextInt();
			}
			
			if (ans ==x-y)
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
	if (inp == 2) 
	{
		System.out.println("Welcome to two-digit subtraction. Enter 2 to continue.");
		inp = sc.nextInt();
	
		while (inp ==2) 
		{		
			x = 10 + randomNumbers.nextInt(99);
				y = 10 + randomNumbers.nextInt(99);
				
				System.out.println("How much is " + x + " minus "+ y);
				ans = sc.nextInt();
				
				while(ans != x-y) 
				{			
					getWgComment();
					numWrong++;
					System.out.println();
					System.out.println("How much is " + x + " minus "+ y);
					ans = sc.nextInt();
				}
				
				if (ans ==x-y)
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
			
		if (inp == 3) 
		{
			System.out.println("Welcome to three-digit subtraction. Enter 3 to continue.");
			inp = sc.nextInt();
		
			while (inp ==3) 
			{		
					x = 100 + randomNumbers.nextInt(999);
					y = 100 + randomNumbers.nextInt(999);
					
					System.out.println("How much is " + x + " minus "+ y);
					ans = sc.nextInt();
					
					while(ans != x-y) 
					{			
						getWgComment();
						numWrong++;
						System.out.println();
						System.out.println("How much is " + x + " minus "+ y);
						ans = sc.nextInt();
					}
					
					if (ans ==x-y)
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
	}		

	public static void askQuestionD()
	{
		Scanner sc = new Scanner(System.in);
		int inp;

		int x, y, ans, count = 1, numCorrect = 0, numWrong = 0, total = 0, percentCorrect ;

		System.out.println("You're about to begin a Test Choose your difficulty level\n"
				+ "1. Dividing one digit numbers i.e. 6 / 7\n"
				+ "2. Dividing two digit numbers i.e. 16 / 17\n"
				+ "3. Dividing three digit numbers i.e. 126 / 127\n"
				+ "4. Or enter 0 to exit ");
		inp = sc.nextInt();
	if (inp ==1)
	{
		System.out.println("Welcome to one-digit division. Enter 1 to continue.");
		inp = sc.nextInt();
		while (inp ==1) 
		{		
			x = randomNumbers.nextInt(9);
			y = randomNumbers.nextInt(9);
			
			System.out.println("How much is " + x + " divided by "+ y);
			ans = sc.nextInt();
			
			while(ans != x/y) 
			{			
				getWgComment();
				numWrong++;
				System.out.println();
				System.out.println("How much is " + x + " divided by "+ y);
				ans = sc.nextInt();
			}
			
			if (ans ==x/y)
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
	if (inp == 2) 
	{
		System.out.println("Welcome to two-digit division. Enter 2 to continue.");
		inp = sc.nextInt();
	
		while (inp ==2) 
		{		
			x = 10 + randomNumbers.nextInt(99);
			y = 10 + randomNumbers.nextInt(99);
				
				System.out.println("How much is " + x + " divided by "+ y);
				ans = sc.nextInt();
				
				while(ans != x/y) 
				{			
					getWgComment();
					numWrong++;
					System.out.println();
					System.out.println("How much is " + x + " divided by "+ y);
					ans = sc.nextInt();
				}
				
				if (ans ==x/y)
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
			
		if (inp == 3) 
		{
			System.out.println("Welcome to three-digit Division. Enter 3 to continue.");
			inp = sc.nextInt();
		
			while (inp ==3) 
			{		
					x = 100 + randomNumbers.nextInt(999);
					y = 100 + randomNumbers.nextInt(999);
					
					System.out.println("How much is " + x + " divided by "+ y);
					ans = sc.nextInt();
					
					while(ans != x/y) 
					{			
						getWgComment();
						numWrong++;
						System.out.println();
						System.out.println("How much is " + x + " divided by "+ y);
						ans = sc.nextInt();
					}
					
					if (ans ==x/y)
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
	}		

	public static void askQuestionR()
	{
		int numQues = 1 + randomNumbers.nextInt(4);
		
		switch (numQues)
		{
		case 1:
			askQuestionA();
			break;
		case 2: 
			askQuestionS();
			break;
		case 3:
			askQuestionM();
			break;
		case 4:
			askQuestionD();
			break;
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