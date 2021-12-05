package ChapterFour;
// Analysis of Examination Results using Nested control Statements.
import java.util.Scanner;
public class Analysis {

	public static void main(String[] args) 
	{
		
		// create Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// initializing variables in Declarations
		int passes = 0 ;
		int failures = 0 ; 
		int studentCounter = 1;
		
		// process 10 students using counter-controlled loop
		while (studentCounter <= 10)
		{
			//prompt the user for input and obtain value from user 
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();
			
			//if...else is nested in the while Statement 
			if (result == 1)
				passes = passes + 1 ;
			else 
				failures = failures + 1;
			
			// increment studentCounter so loop eventually terminates
			studentCounter = studentCounter + 1 ;	
		}
			
		// Termination phase; prepare and display the results 
			System.out.printf("Passed: %d%nFailed: %d%n", passes, failures );
			
			//determine whether more than 8 students passed 
			if (passes > 8 )
				System.out.println("Bonus to the instructor!");
	}
}//end class analysis
